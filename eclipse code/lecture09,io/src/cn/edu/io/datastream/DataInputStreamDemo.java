package cn.edu.io.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamDemo {
   public static void main(String[] args) throws IOException {
      
      InputStream is = null;
      DataInputStream dis = null;
      FileOutputStream fos = null;
      DataOutputStream dos = null;
      byte[] buf = {65,66,67,68,69,70};
      
      try{
         // create file output stream
         fos = new FileOutputStream("c:\\test.txt");
         
         // create data output stream
         dos = new DataOutputStream(fos);
         
         // for each byte in the buffer
         for (byte b:buf)
         {
            // write character to the dos
            dos.writeChar(b);
         }
         
         // force bytes to the underlying stream
         dos.flush();
         
         // create file input stream
         is = new FileInputStream("c:\\test.txt");
         
         // create new data input stream
         dis = new DataInputStream(is);
         
         // read till end of the stream
         while(dis.available()>0)
         {
            // read character
            char c = dis.readChar();
            
            // print
            System.out.print(c);
         }
      }catch(Exception e){
         
         e.printStackTrace();
      }finally{
         
         // releases all system resources from the streams
         if(is!=null)
            is.close();
         if(dos!=null)
            is.close();
         if(dis!=null)
            dis.close();
         if(fos!=null)
            fos.close();
      }
   }
}