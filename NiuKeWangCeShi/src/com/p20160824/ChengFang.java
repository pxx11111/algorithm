package com.p20160824;

public class ChengFang {
	public static void main(String[] args) {
	double x=2;
	int n=2;
	System.out.println(pow(x,n));
	}
public static double power(double x,int n)
{
   if(n==0)
	   return 1;
   double v=power(x, n/2);
   if(n%2==0)
	   {return v*v;}
   else{
	   return v*v*x;}
}
public static double pow(double x,int n)
{
    if(x<0)
    	{return 1/power(x,-n);}
    else{
    	return power(x, n);
    }
    
}
}
