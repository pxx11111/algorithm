package com.pxx;

public class Test1 {
	
	    public int countSum(int n) {
	        // write code here
	        // TODO Auto-generated method stub
	        if(n == 0 || n == 1) return 1;
	        long res[][] = {{1,0,0},{0,1,0},{0,0,1}};  //单位矩阵
	        long basic[][] = {{1,0,1},{1,0,0},{0,1,0}};  //累乘的矩阵
	        int iter = n;
	        //而矩阵basic的（n-1）我们能够快速的求出来，例如n-1的二进制代码为1101的话，(矩阵basic)^((n-1)的次方)=basic^8 * basic^4 * basic^1;
	        while(iter > 1){
	            if((iter&1) == 1){ //二进制代码中这一位不为1就乘如res矩阵
	                res = multiply(res,basic);
	            }
	            basic = multiply(basic,basic);
	            iter = iter>>1;  //移位操作，向右移一位
	        }
	        basic = multiply(res,basic);
	        return (int)(basic[0][0]+basic[2][0])%1000000007;
	    }
	 
	    private static long[][] multiply(long[][] a, long[][] b) {
	        // TODO Auto-generated method stub
	        long res[][] = new long[3][3];
	        for(int i = 0;i < 3;i++){
	            for(int j = 0;j < 3;j++){
	                for(int k = 0;k < 3;k++){
	                    res[i][j] = (res[i][j] + a[i][k]*b[k][j])%1000000007;
	                }
	            }
	        }
	        return res;
	    
	    }
	}


