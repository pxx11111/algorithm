
package com.pxx;

public class LCScopy {
	static  String str1 = "cnblogs";
	 static String str2 = "belong";
	static int dp[][]=new int [str1.length()+1][str1.length()+1];
	  public static void main(String[] args) {
		
		  LCS(str1, str2);

         //ֻҪ�ó��������һ��λ�õ����ּ���
        System.out.println("��ǰ��󹫹������еĳ���Ϊ:"+ dp[str1.length()][str2.length()]);

         
     }
public static void LCS(String str,String str1)
{
  
   	for (int i = 0; i <=str.length(); i++) {
		dp[i][0]=0;
	}
   	for (int i = 0; i <=str1.length(); i++) {
		dp[0][i]=0;
	}
   	for (int i = 1; i <=str.length(); i++) {
		for (int j = 1; j <= str1.length(); j++) {
			if(str.charAt(i-1)==str1.charAt(j-1))
			{
				dp[i][j]=dp[i-1][j-1]+1;
			}else
			{
				dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
			}
		
		}
		
	}
   
}
}