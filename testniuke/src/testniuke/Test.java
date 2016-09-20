package testniuke;

import java.util.Scanner;

class Test{
	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	String str1=sca.next();
	int n=sca.nextInt();
	String str2=sca.next();
	int m=sca.nextInt();
	int ic=sca.nextInt();
	int dc=sca.nextInt();
	int uc=sca.nextInt();
	MinCost min=new MinCost();
	System.out.println(min.findMinCost(str1,n, str2, m, ic, dc, uc));
	}}
	class MinCost {
	    public int findMinCost(String str1, int n, String str2, int m, int ic, int dc, int uc) {
	        // write code here
	    	int [][]dp=new int [n+1][m+1];
	    	//第一列表示str1到空串需要的代价所以是删除代价的倍数，
	        //第一行表示空串到str2需要的代价所以是添加代价的倍数
	        for(int i=1; i<=n ;i++)
	            dp[i][0]=i*dc;
	        for(int i=1; i<=m ;i++)
	            dp[0][i]=i*ic;
	         //dp[i][j]表示str1[0..i-1]变到str2[0..j-1]需要的最小代价
	        for(int i=1 ;i<=n ;i++){
	            for(int j=1 ;j<=m ;j++){
	                //字符相等代价不变，不等就加上修改代价
	                if(str1.charAt(i-1)==str2.charAt(j-1)){
	                    dp[i][j]=dp[i-1][j-1];
	                }else{
	                    dp[i][j]=dp[i-1][j-1]+uc;
	                }
	                //str1前面[0..i-2]的部分变成了str2[0..j-1],加一个删除代价
	                //str1[0..i-1]变成了str2前面的[0..j-2]部分,加一个添加代价
	                //然后取三个代价的最小值更新到dp[i][j]
	               dp[i][j]= Math.min(dp[i][j],dp[i][j-1]+ic);
	               dp[i][j]= Math.min(dp[i][j],dp[i-1][j]+dc);
	            }
	        }
	         return dp[n][m];
	     }
	    }
	
					