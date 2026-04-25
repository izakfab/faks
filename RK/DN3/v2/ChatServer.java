import java.io.*;
import java.net.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ChatServer {

	protected int serverPort = 1234;
	// protected List<Socket> clients = new ArrayList<Socket>(); // list of clients
	protected HashMap<String, Socket> username2Socket = new HashMap<String, Socket>(); // HashMap, ki preslika uporabniško ime v vtič
	protected HashMap<Socket, String> socket2Username = new HashMap<Socket, String>(); // HashMap, ki preslika vtič v uporabniško ime

	public static void main(String[] args) throws Exception {
		new ChatServer();
	}

	public ChatServer() {
		ServerSocket serverSocket = null;

		// create socket
		try {
			serverSocket = new ServerSocket(this.serverPort); // create the ServerSocket
		} catch (Exception e) {
			System.err.println("[system] could not create socket on port " + this.serverPort);
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// start listening for new connections
		System.out.println("[system] listening ...");
		try {
			while (true) {
				Socket newClientSocket = serverSocket.accept(); // wait for a new client connection
				synchronized(this) {
					// clients.add(newClientSocket); // add client to the list of clients
					socket2Username.put(newClientSocket, null); // Doda nov ključ z začasno vrednostjo null v HashMap
				}
				ChatServerConnector conn = new ChatServerConnector(this, newClientSocket); // create a new thread for communication with the new client
				conn.start(); // run the new thread
			}
		} catch (Exception e) {
			System.err.println("[error] Accept failed.");
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// close socket
		System.out.println("[system] closing server socket ...");
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	// send a message to all clients connected to the server
	public void sendToAllClients(String message, Socket posiljatelj) throws Exception {
		Iterator<Socket> i = socket2Username.keySet().iterator(); // Gre skozi vsi kliente s pomočjo ključev socket2Username
		while (i.hasNext()) { // iterate through the client list
			Socket socket = (Socket) i.next(); // get the socket for communicating with this client
			if (socket2Username.get(socket) != null && socket != posiljatelj) // Preveri ali je prejemnik prijavljen ter da ni posiljatelj, saj mu v nasprotenem primeru ne pošlje sporočila
				try {
					DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
					out.writeUTF(message); // send message to the client
				} catch (Exception e) {
					System.err.println("[system] could not send message to a client");
					e.printStackTrace(System.err);
				}
		}
	}

	public void sendToSingleClient(String message, Socket prejemnik) { // Pošlje message le prejemniku
		try {
			DataOutputStream out = new DataOutputStream(prejemnik.getOutputStream());
			out.writeUTF(message);
		} catch (Exception e) {
			System.err.println("[system] could not send message to a client");
			e.printStackTrace(System.err);
		}
	}

	void addClient(Socket socket, String username) { // Doda vnose v HashMapa
		synchronized(this) {
			username2Socket.put(username, socket);
			socket2Username.put(socket, username);
		}
	}

	public void removeClient(Socket socket) { // Izbriše vnose iz HashMapov
		// Priprava sporočila ki bo poslano vsem uprabnikom
		String message = "uporabnik " + socket2Username.get(socket) + " je zapustil klepet";

		LocalDateTime timestamp = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTimestamp = timestamp.format(formatter);

		message = "[" + formattedTimestamp + " | system] " + message;

		// Pošiljanje sporočila vsem uporabnikom
		try {
			sendToAllClients(message, socket);
		} catch (Exception e) {
			System.err.println("[system] could not send message to a client");
			e.printStackTrace(System.err);
		}
		synchronized(this) {
			// clients.remove(socket);

			// Odstranjevanje uprabnika iz HashMapov
			username2Socket.remove(socket2Username.get(socket));
			socket2Username.remove(socket);
		}
	}
}

class ChatServerConnector extends Thread {
	private ChatServer server;
	private Socket socket;

	public ChatServerConnector(ChatServer server, Socket socket) {
		this.server = server;
		this.socket = socket;
	}

	public void run() {
		System.out.println("[system] connected with " + this.socket.getInetAddress().getHostName() + ":" + this.socket.getPort());

		DataInputStream in;
		try {
			in = new DataInputStream(this.socket.getInputStream()); // create input stream for listening for incoming messages
		} catch (IOException e) {
			System.err.println("[system] could not open input stream!");
			e.printStackTrace(System.err);
			this.server.removeClient(socket);
			return;
		}

		while (true) { // infinite loop in which this thread waits for incoming messages and processes them
			String msg_received;
			try {
				msg_received = in.readUTF(); // read the message from the client
			} catch (Exception e) {
				System.err.println("[system] there was a problem while reading message client on port " + this.socket.getPort() + ", removing client");
				e.printStackTrace(System.err);
				this.server.removeClient(this.socket);
				return;
			}

			if (msg_received.length() == 0) // invalid message
				continue;

			// System.out.println("[RKchat] [" + this.socket.getPort() + "] : " + msg_received); // print the incoming message in the console

			String[] msgSplit = msg_received.split("\\|"); // Loči tip in sporočilo
			String prejetTip = msgSplit[0];
			String sporocilo = msgSplit[1];
			for (int i = 2; i < msgSplit.length; i++) { // Sestavi sporočilo, če vsebuje "|"
				sporocilo = sporocilo + "|" + msgSplit[i];
			}
			System.out.printf("Tip: %s \t sporočilo: %s\n", prejetTip, sporocilo);

			// Priprava timesampa za pošiljanje
			LocalDateTime timestamp = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String formattedTimestamp = timestamp.format(formatter);

			String msgSend = "";
			try {
				if (prejetTip.equals("0")) {
					String posiljatelj = this.server.socket2Username.get(this.socket);
					if (sporocilo.charAt(0) == '@') { // Preveri ali pošiljatelj naslavlja kakega prejemnika
						String[] sporociloSplit = sporocilo.split(" ");
						String prejemnik = sporociloSplit[0];
						prejemnik = prejemnik.substring(1, prejemnik.length());

						if (this.server.username2Socket.keySet().contains(prejemnik)) { // Preveri ali prejemnik obstaja
							sporocilo = sporociloSplit[1];
							for (int i = 2; i < sporociloSplit.length; i++) {
								sporocilo = sporocilo + " " + sporociloSplit[i];
							}

							msgSend = "[" + formattedTimestamp + " | " + posiljatelj + " -> " + prejemnik + "] " + sporocilo;
							this.server.sendToSingleClient(msgSend, this.server.username2Socket.get(prejemnik));
						} else {
							msgSend = "[Error] uporabnik '" + prejemnik + "' ne obstaja";
							this.server.sendToSingleClient(msgSend, this.socket);
						}
					} else {
						msgSend = "[" + formattedTimestamp + " | " + posiljatelj + "] " + sporocilo;
						this.server.sendToAllClients(msgSend, this.socket); // send message to all clients
					}
				} else if (prejetTip.equals("1")) { // Prejeto je sporočilo z uporabniškim imenom
					if (!this.server.username2Socket.keySet().contains(sporocilo)) { // Preverjanje ali je uporabniško ime že v uporabi in pošiljanje odgovora
						if (sporocilo.contains(" ") || sporocilo.contains("|")) {
							msgSend = "usernameIllegal";
							this.server.sendToSingleClient(msgSend, this.socket);
						} else {
							msgSend = "usernameAccept";
							this.server.addClient(this.socket, sporocilo);
							this.server.sendToSingleClient(msgSend, this.socket);
							this.server.sendToAllClients("[" + formattedTimestamp + " | server] uporabnik \"" + sporocilo + "\" se je pridružil", null);
						}
					} else {
						msgSend = "usernameTaken";
						this.server.sendToSingleClient(msgSend, this.socket);
					}
				}
				System.out.println(msgSend);
			} catch (Exception e) {
				System.err.println("[system] there was a problem while sending the message");
				e.printStackTrace(System.err);
				continue;
			}
		}
	}
}
