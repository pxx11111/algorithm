package com.pxx;

import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
 Scanner sca=new Scanner(System.in);
 String s=sca.nextLine();
 int key=sca.nextInt();
 String es="";
 String v="qwertyuiopasdfghjklzxcvbnm";
 String V="QWERTYUIOPASDFGHJKLZXCVBNM";
 char[] vh = v.toCharArray();
 char[] Vh = V.toCharArray();
 for(int i=0;i<s.length();i++)
 { char c=s.charAt(i);
 
   int index= v.indexOf(c);
	 if(c>='a'&&c<='z')
	 {
		 index+=key%26;
		 c=vh[index];
		 if(c<'a')
			 c+=26;
		 if(c>'z')
			 c-=26;
	 }
	 else if(c>='A'&&c<='Z')
	 {
		 index+=key%26;
		 c=Vh[index];
		 if(c<'A')
			 c+=26;
		 if(c>'Z')
			 c-=26;
	 }
	 es+=c;
 }
 System.out.println(es);
	}

}
