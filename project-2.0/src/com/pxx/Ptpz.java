package com.pxx;

import java.util.Scanner;

public class Ptpz {
	    public static void main(String[] args) 
			
		{
	    	int i,j,k,size;
		       int a[]=new int[100];
		       System.out.print("please input the size of heap:");
		       Scanner sc=new Scanner(System.in);
		       while(sc.hasNextInt()&&(size=sc.nextInt())>0){
		       
		        
		    	   System.out.print("请输入堆的元素值：");
		        for(i=1;i<=size;i++)
		        { a[i]=sc.nextInt();}
		        System.out.print ("请输入ｋ的值");
		           k=sc.nextInt();

		           for(i=k/2;i>=1;i--)
		               HeapAdjust(a,i,k);
		           
		        for(j=k+1;j<=size;j++)
		           {
		            if(a[j]<a[1])
		               {
		                a[1]=a[j];
		                   HeapAdjust(a,1,k);
		               
		               }
		           }

		           for(i=1;i<=k;i++)
		               System.out.println(a[i]);
		       }
		   return;

		}
	  


	   public static void HeapAdjust(int a[],int i,int k)
	   {
	       int lchild,rchild;
	       int max=i;
	       lchild=2*i;
	       rchild=2*i+1;
	       if(i<=k/2)
	       {
	           if(lchild<=k && a[lchild]>a[max])
	            max=lchild;
	        if(rchild<=k && a[rchild]>a[max])
	            max=rchild;
	        if(max!=i)
	           {int temp;
	            temp=a[max];
	            a[max]=a[i];
	            a[i]=temp;
	        HeapAdjust(a,max,k);
	           }
	       }

	   }


	   
	}



