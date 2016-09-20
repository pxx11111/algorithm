package t20160809;

import java.util.Scanner;

public class Test4 {
public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           String a = sc.nextLine();
           String b = sc.nextLine();
           int m = 0;
           for (int i = 0; i < a.length(); i++) {
			String str=a.substring(0,i)+b+a.substring(i,a.length()-1);
			StringBuffer buffer=new StringBuffer(str);
			if(buffer.reverse().toString().equals(buffer.toString()))
				m++;
		}
           System.out.println(m);
       }
}
}