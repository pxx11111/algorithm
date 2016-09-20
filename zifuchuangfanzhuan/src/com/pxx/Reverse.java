package com.pxx;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		String str=sc.nextLine();
		int n=sc.nextInt();
		
		System.out.println(trans(str,n));}
	}
		    public static String trans(String s, int n) {
		        // write code here
		     
		        /*
		        思路：1.将s按照单词分隔保存到字符串数组里面，并转为其大小写2.实现反序
		        */
		        String str[]=new String[n];
		        String word="";
		        int j=0;//代表单词个数
		        int i;
		        for(i=0;i<n;i++){
		            char curChar=s.charAt(i);
		            if(s.charAt(i) == ' '){
		                str[j++]=word;
		                word="";
		            }else{  
		                 if(curChar>='a'&&  curChar <='z'){ //小写字母转为大写  
		                    curChar=(char)(curChar-32);
		                  }else{//大写字母转为小写
		                     curChar=(char)(curChar+32);
		                 } 
		                word+=curChar;
		            }          
		        }
		        str[j]=word;
		       //反序
		        for(i=0;i<(j+1)/2;i++){
		            String tmp= str[i];           
		            str[i]=str[j-i];
		            str[j-i]=tmp;
		        }
		        String str1="";
		        for(i=0;i<=j;i++){
		            str1+=str[i];
		            if(i !=j){
		                str1+=" ";
		            }
		        }
		        return str1;
		    
		   
		    }}
	


