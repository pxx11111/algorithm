package cn.edu.udp.jp;

import java.net.*;
public class UdpTest
{
	public static void main(String[] args) throws Exception
	{
		if(args.length > 0)
			receive();
		else
			send();
	}
	
	public static void receive() throws Exception
	{
		DatagramSocket ds = new DatagramSocket(7000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,1024);
		
		ds.receive(dp);
		
		System.out.println(new String(buf,0,dp.getLength()));
		
		buf = "这是接收端向你发送的数据".getBytes();
		DatagramPacket dpSend = new DatagramPacket(
			buf, buf.length, dp.getAddress(), dp.getPort());
		ds.send(dpSend);
		ds.close();
	}
	
	public static void send() throws Exception
	{
		InetAddress address = InetAddress.getByName("127.0.0.1");
		
		String sendStr = "欢迎来到程序员之家,这是send端";
		byte[] buf = sendStr.getBytes();
		DatagramPacket dp = new DatagramPacket(
			buf,buf.length,address,7000);
			
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		
		ds.receive(dp);
		System.out.println(new String(buf,0,dp.getLength()));
		
		ds.close();
	}
}