package huanLingQian;

public class Test {
	public static void main(String[] args) {
		int []ch=new int[]{5,10,25,1};
		int n=ch.length;
		int x=15;
		Exchange ex=new Exchange();
		System.out.println(ex.countWays(ch,n, x));
	}
	}
 class Exchange {
    public int countWays(int[] changes, int n, int x) {
        // write code here
          // write code here
        //dp[i][j]表示使用changes[0~i]的钱币组成金额j的方法数
        int[][] dp=new int[n][x+1];
        //第一列全为1，因为组成0元就只有一种方法
        for(int i=0;i<n;i++)
            dp[i][0]=1;
        //第一行只有changes[0]的整数倍的金额才能有1种方法
        for(int j=0;j*changes[0]<=x;j++){
            dp[0][j*changes[0]]=1;
        }
        //从位置(1,1)开始遍历
        for(int i=1;i<n;i++){
            for(int j=1;j<=x;j++){
                //关键：使用0~i的钱币组成j-changes[i]金额的方法数+使用0~i-1钱币组成j的方法数
                dp[i][j]=dp[i-1][j]+(j-changes[i]>=0?dp[i][j-changes[i]]:0);
            }
        }
         
        return dp[n-1][x];
    }
}