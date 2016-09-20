package com.pxx;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
public static void main(String[] args) {
Scanner sca=new Scanner(System.in);
String str=sca.nextLine();
int result=0;
while(result!=6174){
	char[]ch=creat(str);
	
	Arrays.sort(ch);
	String str1=new String(ch);

	//StringBuffer buff=new StringBuffer(str1);
	//int m=Integer.parseInt(str1);
	//String n1=buff.reverse().toString();
	//int n=Integer.parseInt(n1);
	int n=0;
	int m=0;
	 char[] l = new char[4];
	for(int i = 3;i>=0;i--){
        n = n*10+ch[i]-'0';
        m = m*10+ch[3-i]-'0';
        l[i] = ch[3-i];
    }
	String n1=new String(l);
	
	if(n-m==0)
		{System.out.println(n1+"-"+str1+"="+"0000");
		return;
		}
	result=n-m;
	
	System.out.println(n1+"-"+str1+"="+result);
	str=String.valueOf(result);
	}


}
private static char[] creat(String s){
    char[] num = new char[4];
    for(int i = 0;i<num.length;i++){
        if(i>=s.length())
            num[i] = '0';
        else
            num[i] = s.charAt(i);
    }
    return num;
}
	

}

