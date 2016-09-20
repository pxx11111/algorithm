package cn.edu.socket.jp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class RemoteFileServer {
	protected InetAddress IP;
	protected int listenPort = 3000;

	public static void main(String[] args) {
		RemoteFileServer rfs = new RemoteFileServer();
		rfs.acceptConnections();

	}

	/*public RemoteFileServer(int listenPort) {
		super();
		this.listenPort = listenPort;
	}*/

	public void acceptConnections() {
		try {
		    
			ServerSocket server = new ServerSocket(listenPort);
			
			Socket incommingConnection = null;

			while (true) {
				incommingConnection = server.accept();
				handleConnections(incommingConnection);
			}
		} catch (BindException e) {
			System.out.println("Unable to binding to port:" + listenPort);
			;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to instantiate the socket on port:"
					+ listenPort);
		}
	}

	public void handleConnections(Socket incommingConnection) {
		try {
			OutputStream outputToSocket = incommingConnection.getOutputStream();
			InputStream inputFromSocket = incommingConnection.getInputStream();
			BufferedReader streamReader = new BufferedReader(
					new InputStreamReader(inputFromSocket));
			FileReader fileReader = new FileReader(new File(
					streamReader.readLine()));

			BufferedReader bufferedFileReader = new BufferedReader(fileReader);
			System.out.println("file1");
			PrintWriter streamWriter = new PrintWriter(
					outputToSocket);
			String line = null;

			while ((line = bufferedFileReader.readLine()) != null) {
				    streamWriter.println(line);
			}
			System.out.println("Transfer end!");
			fileReader.close();
			streamWriter.close();
			streamReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error handling a client:" + e);
		}
	}

}
