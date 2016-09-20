package com.p20160824;

import java.util.ArrayList;

public class RestoreBaoLiMeiJv {
	public static void main(String[] args) {
		String str="25525511135";
		ArrayList<String>arr=new ArrayList<>();
		arr=restoreIpAddresses(str);
		for (String string : arr) {
			System.out.println(string);
		}
		
	}
	  public static ArrayList<String> restoreIpAddresses(String s) {
	int len=s.length();
    ArrayList<String> ips=new ArrayList<String>();
if(len>12||len<4)return ips;
    String i1,i2,i3,i4;
    for(int a=1;a<=3;a++)
        for(int b=1;b<=3;b++)
        for(int c=1;c<=3;c++){
        int d=len-a-b-c;
        if(d>3||d<1) continue;
        
        i1=s.substring(0,a);
        if(Integer.parseInt(i1)>255||(a>1&&i1.charAt(0)=='0')) continue;
        
        i2=s.substring(a,a+b);
        if(Integer.parseInt(i2)>255||(b>1&&i2.charAt(0)=='0')) continue;
                
        i3=s.substring(a+b,a+b+c);
        if(Integer.parseInt(i3)>255||(c>1&&i3.charAt(0)=='0')) continue;
        
        i4=s.substring(a+b+c,len);
        if(Integer.parseInt(i4)>255||(d>1&&i4.charAt(0)=='0')) continue;
        String ip=i1+"."+i2+"."+i3+"."+i4;
        ips.add(ip);
    }
    return ips;
}
	  }
