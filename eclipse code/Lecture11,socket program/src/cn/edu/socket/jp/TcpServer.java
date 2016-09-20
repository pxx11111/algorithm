package cn.edu.socket.jp;

import java.net.*;
import java.io.*;

public class TcpServer// extends Thread
{
	public static void main(String[] args) throws Exception
	{
		server();
	}
	
	public static void server() throws Exception
	{
		ServerSocket ss = new ServerSocket(7000);
		
		while(true)
		{
			Socket s = ss.accept();
			new ServerThread(s).start();
		}
	}

}

class ServerThread extends Thread
{
	private Socket s;
	public ServerThread(Socket s)
	{
		this.s = s;
	}
	
	public void run()
	{
		try
		{
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			
			os.write("欢迎来到西安".getBytes());
			byte[] buf = new byte[1024];
			
			int len = is.read(buf);
			
			System.out.println(new String(buf,0,len));
			is.close();
			os.close();
			s.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}