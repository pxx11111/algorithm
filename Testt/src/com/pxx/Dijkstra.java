package com.pxx;

import java.util.Stack;

public class Dijkstra {
public static void main(String[] args) {
	int n=5;
	int u=0;
	int max=Integer.MAX_VALUE;
	float dist[]=new float[n-1];
	int p[]=new int[n-1];
	int C[][]={{max,8,32,max,max},{12,max,16,15,max},{max,29,max,max,13},
			{max,21,max,max,7},{max,max,27,19,max}};
	test(n,u,dist,p,C);
	System.out.println(p[1]);
	
}
static void test(int n,int u,float dist[],int p[],int C[][])
{  
	boolean[] s=new boolean[n];
	for (int i = 0; i <n; i++) {
		dist[i]=C[u][i];
		s[i]=false;
		if(dist[i]==Integer.MAX_VALUE)
	    p[i]=-1;
		else
			p[i]=u;
		
				}
	
	dist[u]=0;
	 s[u]=true;
	 for (int i = 0; i <n; i++) {
		int temp=Integer.MAX_VALUE;
		int t=u;
		for (int j = 1; j <=n; j++) 
			if((!s[j])&&(dist[j]<temp))
			{
				t=j;
				temp=(int) dist[j];
			}
			if(t==u)
				break;
			s[t]=true;
			for (int j = 1; j <=n; j++) {
				if((!s[j])&&(C[t][j]<Integer.MAX_VALUE))
					if(dist[j]>(dist[t]+C[t][j]))
						dist[j]=dist[t]+C[t][j];
				p[j]=t;
				
			}
		}
	
	}
	}
  

