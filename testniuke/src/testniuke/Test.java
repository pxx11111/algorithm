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
	    	//��һ�б�ʾstr1���մ���Ҫ�Ĵ���������ɾ�����۵ı�����
	        //��һ�б�ʾ�մ���str2��Ҫ�Ĵ�����������Ӵ��۵ı���
	        for(int i=1; i<=n ;i++)
	            dp[i][0]=i*dc;
	        for(int i=1; i<=m ;i++)
	            dp[0][i]=i*ic;
	         //dp[i][j]��ʾstr1[0..i-1]�䵽str2[0..j-1]��Ҫ����С����
	        for(int i=1 ;i<=n ;i++){
	            for(int j=1 ;j<=m ;j++){
	                //�ַ���ȴ��۲��䣬���Ⱦͼ����޸Ĵ���
	                if(str1.charAt(i-1)==str2.charAt(j-1)){
	                    dp[i][j]=dp[i-1][j-1];
	                }else{
	                    dp[i][j]=dp[i-1][j-1]+uc;
	                }
	                //str1ǰ��[0..i-2]�Ĳ��ֱ����str2[0..j-1],��һ��ɾ������
	                //str1[0..i-1]�����str2ǰ���[0..j-2]����,��һ����Ӵ���
	                //Ȼ��ȡ�������۵���Сֵ���µ�dp[i][j]
	               dp[i][j]= Math.min(dp[i][j],dp[i][j-1]+ic);
	               dp[i][j]= Math.min(dp[i][j],dp[i-1][j]+dc);
	            }
	        }
	         return dp[n][m];
	     }
	    }
	
					