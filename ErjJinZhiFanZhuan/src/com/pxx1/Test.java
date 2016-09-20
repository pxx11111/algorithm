package com.pxx1;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	while(sca.hasNext()){
		String str=sca.nextLine();
		char []cha=str.toCharArray();
		char m;
	    int n=sca.nextInt();
	    for(int i=0;i<n;i++){
	    	int p=sca.nextInt();
	    	int q=sca.nextInt();
	    	if(cha[p]>=cha[q])
	    	{
	    		m=cha[p];
	    		cha[p]=cha[q];
	    		cha[q]=m;
	    		
	    	}else{
	    		continue;
	    		}
	    	}
	 
	   
	    for(int j=0;j<cha.length;j++){
	    System.out.print(cha[j]);}
	}
}
}
