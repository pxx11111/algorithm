package cn.edu.socket.jp;

import java.io.*;
import java.net.*;

public class TcpClient
{
		
	public static void client(String name) throws Exception
	{

		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket s = new Socket(address, 7000);
		
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		byte[] buf = new byte[1024];
		
		int len = is.read(buf);
		
		System.out.println(new String(buf,0,len));
		String str = "你好，西安，我是 " + name;
		os.write(str.getBytes());
		
		is.close();
		os.close();
		s.close();
	}
    public static void main(String[] args) 
	{
       try{
		   client(args[0]);
	   }catch(Exception e){
	   
	   }
	}
}
