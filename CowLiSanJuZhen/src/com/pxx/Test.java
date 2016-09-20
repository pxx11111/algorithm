package com.pxx;

public class Test {

		    long countSum(int n) {
		        if(n<=3) return n;
		       long [][] matrix= {{1,1,0},{0,0,1},{1,0,0}};
		       long matrix2[][] = {{1,0,0},{0,0,1},{1,0,0}};
		       long matrix3[][] = {{1,0,0},{0,1,0},{0,0,1}};
		        n = n-3;
		        while(n!=0){
		            if((n&1)!=0){
		                for(int i = 0; i < 3; ++i){
		                    for(int j = 0; j < 3; ++j){
		                        matrix2[i][j] = (matrix3[i][0]*matrix[0][j]+matrix3[i][1]*matrix[1][j]+matrix3[i][2]*matrix[2][j])%1000000007;
		                    }
		                }
		                for(int i = 0; i < 3; ++i){
		                    for(int j = 0; j < 3; ++j){
		                        matrix3[i][j] = matrix2[i][j];
		                    }
		                }
		            }
		            for(int i = 0; i < 3; ++i){
		                for(int j = 0; j < 3; ++j){
		                    matrix2[i][j] = (matrix[i][0]*matrix[0][j]+matrix[i][1]*matrix[1][j]+matrix[i][2]*matrix[2][j])%1000000007;
		                }
		            }
		            for(int i = 0; i < 3; ++i){
		                for(int j = 0; j < 3; ++j){
		                    matrix[i][j] = matrix2[i][j];
		                }
		            }
		            n = n>>1;
		        }
		        return (3*matrix3[0][0]+2*matrix3[1][0]+matrix3[2][0])%1000000007;
		    }
		};

