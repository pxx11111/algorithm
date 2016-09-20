package com.pxx;

public class Test1 {
private Test1() {
		// TODO Auto-generated constructor stub
	}

private static Test1 test=new Test1();
public static Test1 getinstance()
{return test;
	}


	
    public static void main(String[] args) {
    	Test1 test=Test1.getinstance();
    	Test1 test2=Test1.getinstance();
		System.out.println(test==test2);
	}
}