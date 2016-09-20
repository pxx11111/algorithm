package com.xiecheng;

import java.util.*;

public class Test3{
	
	static int n;
	static int [][] adj;
	static boolean vis[];
	static int ans = Integer.MAX_VALUE;
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
    	
    	while(in.hasNext())
    	{
    		 n = in.nextInt();
    		 adj = new int[n][n];
    		 vis  = new boolean[n];
    		String rub = in.nextLine();
    		for(int i = 0; i<n; i++)
    		{
    			String str = in.nextLine();
    			String [] line = str.split(",");
    			for(int j = 0; j<n; j++)
    			{
    				adj[i][j] = Integer.parseInt(line[j]);
    			}
    		}
    		for(int i = 0; i<n; i++)
    		{
    			dfs(i, 1, 0);
    		}
    		System.out.println(ans);
    		
    	}
    }
    static void dfs(int i, int len, int cost)
    {
    	if(len == n)
    	{
    		ans = Math.min(ans, cost);
    		return;
    	}
    	if(cost >= ans) return;
    	vis[i] = true;
    	for(int j = 0; j<n; j++)
    	{
    		if(j!=i && !vis[j])
    		{
    			dfs(j, len +1, cost + adj[i][j]);
    			
    		}
    	}
    	vis[i] = false;
    }
   
    
}
