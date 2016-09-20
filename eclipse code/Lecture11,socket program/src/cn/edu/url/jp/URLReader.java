package cn.edu.url.jp;
import java.io.*;
import java.net.*;
public class URLReader {
     public static void main(String[] args) throws Exception { 
          URL url = new URL("http://www.yahoo.com/"); 
          BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

           String inputLine;     
	      File outfile = new File("test.html");	  
	      PrintWriter out = new PrintWriter(new FileWriter(outfile));
            while ((inputLine = in.readLine()) != null) {
                             //从输入流中不断读取数据直到读完为止
               out.println(inputLine); //把读入的数据写入test.html
	   }
          in.close(); //关闭输入流
          out.close();
     }
 }
