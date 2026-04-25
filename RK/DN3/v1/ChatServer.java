import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

	protected int serverPort = 1234;
	protected List<Socket> clients = new ArrayList<Socket>(); // list of clients
	protected HashMap<Socket, String> client2Name = new HashMap<Socket, String>(); // pretvorba iz client v ime
	protected HashMap<String, Socket> name2Client = new HashMap<String, Socket>(); // pretvorba iz imena v client

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
					clients.add(newClientSocket); // add client to the list of clients
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
	public void addClient(Socket hostname, String name) { // dodajanje parov v HashMap-a za pretvorbo med imeni in Socket objekti
		client2Name.put(hostname, name);
		name2Client.put(name, hostname);
	}

	public String getClientName(Socket hostname) {
		return client2Name.get(hostname); // pridobivanje imen iz Socket objektov
	}

	public Socket getClient(String username) { // pridobivanje Socket objektov iz imen
		if (name2Client.keySet().contains(username))
			return name2Client.get(username);
		return null;
	}

	// send a message to all clients connected to the server
	public void sendToAllClients(String message, Socket sender) throws Exception {
		Iterator<Socket> i = clients.iterator();
		while (i.hasNext()) { // iterate through the client list
			Socket socket = (Socket) i.next(); // get the socket for communicating with this client
			if (sender != socket)
				try {
					DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
					out.writeUTF(message); // send message to the client
				} catch (Exception e) {
					System.err.println("[system] could not send message to a client");
					e.printStackTrace(System.err);
				}
		}
	}

	// pošiljanje zasebnega sporočila točno določenemu naslovniku
	public void sendPrivate(String message, Socket sender) throws Exception {
		String recipient = message.split(" ")[3].substring(2, message.split(" ")[3].length());
		Socket socket;
		try {
			socket = getClient(recipient); // pridobivanje Socket objekta iz uporabnikovega imena (null če uporabnik ne obstaja)
			// System.out.println(recipient);
			if (socket != null) { // preverjanje ali uporabnik obstaja
				DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
				out.writeUTF(message); // pošiljanje prejemniku
			} else {
				DataOutputStream out = new DataOutputStream(sender.getOutputStream());
				out.writeUTF(recipient + " could not be found"); // pošiljanje napake pošiljatelju
			}
		} catch (Exception e) {
			System.err.println("[system] could not send message to a client");
			e.printStackTrace(System.err);
		}
	}

	public void sendGoodbye(Socket sender) throws Exception {
		Iterator<Socket> i = clients.iterator();
		while (i.hasNext()) { // iterate through the client list
			Socket socket = (Socket) i.next(); // get the socket for communicating with this client
			try {
				DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
				out.writeUTF(client2Name.get(sender) + " has left the chat"); // send message to the client
			} catch (Exception e) {
				System.err.println("[system] could not send message to a client");
				e.printStackTrace(System.err);
			}
		}
	}

	public void removeClient(Socket socket) {
		synchronized(this) {
			clients.remove(socket);
			try {
				sendGoodbye(socket); // izpis naznanila da je uporabnik zapustil klepet
			} catch (Exception e) {
				System.err.println("[system] could not send goodby message to clients");
				e.printStackTrace(System.err);
			}
			client2Name.remove(socket);
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

			System.out.println("[RKchat] [" + this.socket.getPort() + "] : " + msg_received); // print the incoming message in the console

			String[] msg_spliced = msg_received.split("_"); // prejeto sporočilo bo v obliki Tip_Čas_Sporočilo (Tip 1: ime novega uporabnika, Tip 0: sporočilo)

			String msg_send = msg_spliced[2]; // iz msg_spliced pridobi sporočilo

			for (int i = 3; i < msg_spliced.length; i++) { // popravi sporočilo, če vsebuje '_'
				msg_send = msg_send + "_" + msg_spliced[i];
			}

			if (msg_spliced[0].equals("1")) { // preverjanje tipa sporočila in formatiranje sporočila
				this.server.addClient(socket, msg_send); // dodajanje novega uporabnika
				msg_send = msg_spliced[1] + " |" + msg_send + " has joined the chat";
			} else {
				msg_send = msg_spliced[1] + " |By " + this.server.getClientName(socket) + " |" + msg_send;
			}

			try {
				// System.out.println(msg_send.split(" ")[3]);
				if (msg_send.split(" ")[3].charAt(1) == '@') // preverjanje ali se sporočilo začne z @, ki naznanja naslavljanje uporabnika
					this.server.sendPrivate(msg_send, socket); // pošiljanje sporočila le naslovljencu
				else
					this.server.sendToAllClients(msg_send, socket); // send message to all clients
			} catch (Exception e) {
				System.err.println("[system] there was a problem while sending the message to all clients");
				e.printStackTrace(System.err);
				continue;
			}
		}
	}
}
