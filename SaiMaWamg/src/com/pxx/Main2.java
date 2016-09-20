package com.pxx;

import java.util.*;

public class Main2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	    while(sc.hasNextInt()){
	      int m = sc.nextInt();
	      int n = sc.nextInt();
          int[] total = new int[m+1];
          for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int t=a;t<=b;t++)
                 total[t]=1;
          }
          int temp=0;
          for(int k=0;k<=m;k++){
            if(total[k]==0)
               temp++;
          }
          System.out.println(temp);
        }
  }
}
