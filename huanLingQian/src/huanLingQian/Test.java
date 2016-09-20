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
        //dp[i][j]��ʾʹ��changes[0~i]��Ǯ����ɽ��j�ķ�����
        int[][] dp=new int[n][x+1];
        //��һ��ȫΪ1����Ϊ���0Ԫ��ֻ��һ�ַ���
        for(int i=0;i<n;i++)
            dp[i][0]=1;
        //��һ��ֻ��changes[0]���������Ľ�������1�ַ���
        for(int j=0;j*changes[0]<=x;j++){
            dp[0][j*changes[0]]=1;
        }
        //��λ��(1,1)��ʼ����
        for(int i=1;i<n;i++){
            for(int j=1;j<=x;j++){
                //�ؼ���ʹ��0~i��Ǯ�����j-changes[i]���ķ�����+ʹ��0~i-1Ǯ�����j�ķ�����
                dp[i][j]=dp[i-1][j]+(j-changes[i]>=0?dp[i][j-changes[i]]:0);
            }
        }
         
        return dp[n-1][x];
    }
}