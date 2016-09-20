package cn.edu.socket.jp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class RemoteFileClient {
	protected String hostIP = null;
	protected int hostPort = 0;
	protected BufferedReader socketReader = null;
	protected PrintWriter socketWriter = null;

	public RemoteFileClient(String hostIP, int hostPort) {
		super();
		this.hostIP = hostIP;
		this.hostPort = hostPort;
	}
    
	public static void main(String args[]){
		RemoteFileClient rfc = new RemoteFileClient("127.0.0.1",3000);
		rfc.setUpConnection();
		String fileContent = rfc.getFile("d:/f1.txt");
		System.out.println(fileContent);
	}
	
	public void setUpConnection(){
		
			try {
				Socket client = new Socket(hostIP,hostPort);
				socketReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				socketWriter = new PrintWriter(client.getOutputStream());
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("Error setting up socket connection,unknown host at " + hostIP + ":" + hostPort);;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public String getFile(String fileNameToGet){
		StringBuilder fileLines = new StringBuilder();
		
		try {
			socketWriter.println(fileNameToGet);
			socketWriter.flush();
			System.out.println("filename:" + fileNameToGet + "is transfer!");
			String line = null;
			while((line = socketReader.readLine())!=null){
				
				fileLines.append(line + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error reading file:" + fileNameToGet);
		}
		
				
		return fileLines.toString();
		
	}
	
	public void tearDownConnection(){
		try {
			socketWriter.close();
			socketReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error tearing down socket connection:" + e);
		}
	}
}
