package com.pxx1;

import java.util.Scanner;

public class Test {
	public static int i=0;
	static void move(int n,char from,char to) //�����Ϊn��������from�ƶ���to  
	{   
		System.out.println("��"+(i++)+"��"+":��"+n+"������"+from+"---->"+to);  
	}  
	 static void hanoi(int n,char from,char denpend_on,char to)//��n�������ɳ�ʼ���ƶ���Ŀ����(���ý�����)  
	{  
	    if (n==1)  
	    move(1,from,to);//ֻ��һ��������ֱ�ӽ������ϵ������ƶ���Ŀ�ĵ�  
	    else  
	    {  
	      hanoi(n-1,from,to,denpend_on);//�Ƚ���ʼ����ǰn-1�����ӽ���Ŀ�����ƶ�����������  
	      move(n,from,to);              //��ʣ�µ�һ�������ƶ���Ŀ������  
	      hanoi(n-1,denpend_on,from,to);//��󽫽������ϵ�n-1�������ƶ���Ŀ������  
	    }  
	}  
	public static void main(String[] args) 
	{  
	     System.out.println("���������ӵĸ���:\n");  
	      Scanner sca=new Scanner(System.in);
	      int n=sca.nextInt();
	     char x='A',y='B',z='C';  
	     System.out.println("�����ƶ��������:\n");  
	     hanoi(n,x,y,z);  
	}
}