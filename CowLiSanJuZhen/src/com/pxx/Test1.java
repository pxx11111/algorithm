package com.pxx;

public class Test1 {
	
	    public int countSum(int n) {
	        // write code here
	        // TODO Auto-generated method stub
	        if(n == 0 || n == 1) return 1;
	        long res[][] = {{1,0,0},{0,1,0},{0,0,1}};  //��λ����
	        long basic[][] = {{1,0,1},{1,0,0},{0,1,0}};  //�۳˵ľ���
	        int iter = n;
	        //������basic�ģ�n-1�������ܹ����ٵ������������n-1�Ķ����ƴ���Ϊ1101�Ļ���(����basic)^((n-1)�Ĵη�)=basic^8 * basic^4 * basic^1;
	        while(iter > 1){
	            if((iter&1) == 1){ //�����ƴ�������һλ��Ϊ1�ͳ���res����
	                res = multiply(res,basic);
	            }
	            basic = multiply(basic,basic);
	            iter = iter>>1;  //��λ������������һλ
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


