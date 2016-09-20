package com.pxx20160806;

public class Test {
	public static void main(String[] args) {
		char[]a={'a','b','a','b'};
		char[]b={'a','b','c'};
		System.out.println(StringContain(a,b));
	}
	public static boolean StringContain(char []a,char[] b)
	{
	    int hash = 0;
	    for (int i = 0; i < a.length; ++i)
	    {   int n=(a[i] - 'A');
	    System.out.println(n+" "+i);
	    	int m=1 << n;
	    System.out.println(m+" "+i);
	        hash |= m;
	    }
	    
	    for (int i = 0; i < b.length; ++i)
	    {
	        if ((hash & (1 << (b[i] - 'A'))) == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
