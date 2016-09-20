package cn.edu.io;


import java.io.*;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		BufferedReader source;
		BufferedWriter target;
		String temp;
		StringBuilder sb =new StringBuilder();
		int i=0;
		String[] array;
		source = new BufferedReader(new FileReader("pbookinfo.txt"));
		target = new BufferedWriter(new FileWriter("pbookinfonew.txt"));
		temp=source.readLine();
		if(temp!=null){
		    target.write(temp);
		    target.newLine();
		}
		while ((temp = source.readLine()) != null) { /* ______(2)_________ */
			i++;
			if(i==3 || i==4){
			   array = temp.split("[\\s]+");
			   float price = Float.parseFloat(array[3]);
			   price+=(i==3?20:30);
			   array[3] = String.valueOf(price);
			   sb.delete(0, sb.length());
			   for(String s:array){
				   sb.append(s).append("     ");
			   }
			  // sb.append("\r\n");
			   temp = sb.toString();
			}
			target.write(temp);
			target.newLine();
			// ______(3)_________
			target.flush();
		}
		// ______(4)_________
		source.close();
		// ______ (5)_________
		target.close();
	}
}
