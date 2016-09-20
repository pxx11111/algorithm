package cn.edu.io.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInAndDataOutStream {

	public static void main(String[] args) {
		FileOutputStream fos;
		DataOutputStream out_data = null;
		try {
			fos = new FileOutputStream("Data.dat");
			out_data = new DataOutputStream(fos);
			out_data.writeInt(159);
			out_data.writeInt(655);
			out_data.writeLong(987654);
			out_data.writeFloat(3.14f);
			out_data.writeFloat(9.876f);
			out_data.writeDouble(92526.876);
			out_data.writeBoolean(true);
			out_data.writeBoolean(false);
			out_data.writeUTF("Java语言很有用！");
			out_data.writeByte(123);
			out_data.writeChars("I am ok!世界也ok!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /**
         * writeBytes()、writeChars()方法没有对应的readBytes()与readChars()
         */
		FileInputStream fis;
		DataInputStream in_data = null;
		try {
			 fis = new FileInputStream("Data.dat");
			 in_data = new DataInputStream(fis);
			 System.out.println(":" + in_data.readInt());
			 System.out.println(":" + in_data.readInt());
			 System.out.println(":" + in_data.readLong());
			 System.out.println(":" + in_data.readFloat());
			 System.out.println(":" + in_data.readFloat());
			 System.out.println(":" + in_data.readDouble());
			 System.out.println(":" + in_data.readBoolean());
			 System.out.println(":" + in_data.readBoolean());
			 System.out.println(":" + in_data.readUTF());
			 System.out.println(":" + in_data.readByte());
			 char c;
			 while((c=in_data.readChar())!='\u0000'){
				 System.out.print(c);
			 }
			 System.out.println("hello");
			/*while(in_data.available()>0){
			   c=in_data.readChar();
			   System.out.print(c);
		    }*/
			
		} catch (EOFException e) {
			System.out.println("读取结束");
			//e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				in_data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
