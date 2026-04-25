import java.io.*;
import java.net.*;

public class ChatClient extends Thread
{
	protected int serverPort = 1234;
	protected boolean usernameSet = false; // Na začetku uporabniško ime še ni nastavljeno

	public static void main(String[] args) throws Exception {
		new ChatClient();
	}

	public ChatClient() throws Exception {
		Socket socket = null;
		DataInputStream in = null;
		DataOutputStream out = null;

		// connect to the chat server
		try {
			System.out.println("[system] connecting to chat server ...");
			socket = new Socket("localhost", serverPort); // create socket connection
			in = new DataInputStream(socket.getInputStream()); // create input stream for listening for incoming messages
			out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages
			System.out.println("[system] connected");

			ChatClientMessageReceiver message_receiver = new ChatClientMessageReceiver(in, this); // create a separate thread for listening to messages from the chat server
			message_receiver.start(); // run the new thread
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// read from STDIN and send messages to the chat server
		BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		System.out.print("[LogIn] Izberite si uporabniško ime: ");
		while ((userInput = std_in.readLine()) != null) { // read a line from the console
			if (usernameSet)
				this.sendMessage("0|" + userInput, out); // send the message to the chat server
			else
				this.sendMessage("1|" + userInput, out); // Tip 1 pomeni da je bilo poslano uporabniško ime
		}

		// cleanup
		out.close();
		in.close();
		std_in.close();
		socket.close();
	}

	private void sendMessage(String message, DataOutputStream out) {
		try {
			out.writeUTF(message); // send the message to the chat server
			out.flush(); // ensure the message has been sent
		} catch (IOException e) {
			System.err.println("[system] could not send message");
			e.printStackTrace(System.err);
		}
	}
}

// wait for messages from the chat server and print the out
class ChatClientMessageReceiver extends Thread {
	private DataInputStream in;
	private ChatClient client;

	public ChatClientMessageReceiver(DataInputStream in, ChatClient client) {
		this.in = in;
		this.client = client;
	}

	public void run() {
		try {
			String message;
			while ((message = this.in.readUTF()) != null) { // read new message
				if (client.usernameSet) // Sporočilo izpiše, le če je nastavljeno uporabniško ime
					System.out.println("[RKchat] " + message); // print the message to the console
				else {
					if (message.equals("usernameAccept")) { // Odjemalnik od strežnika dobi sporočilo "usernameAccept", le ko je izbrano uporabniško ime na voljo
						client.usernameSet = true;
					} else if (message.equals("usernameTaken")) { // Odjemalnik od strežnika dobi sporočilo "usernameDecline", le ko izbrano uporabniško ime ni na voljo
						System.out.print("[LogIn] Uporabniško ime je že zasedeno, izberite si drugega: ");
					} else if (message.equals("usernameIllegal")) {
						System.out.print("[LogIn] Uporabniško ime vsebuje prepovedane znake, t.j. presledek (' ') ali pokončnica ('|'), izbarite si drugega: ");
					}
				}
			}
		} catch (Exception e) {
			System.err.println("[system] could not read message");
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}
}
