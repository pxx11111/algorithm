package com.pxx;

public class Test {
	public static void main(String[] args) {
		int A=9;
		int B=0;
		int n=7;
		int[]e={66,2,6,2,8,4,3};
		int[]a={7,12,65,7,4,40,15};
		int []c=result(A, B, n,e, a);
		for(int i=0;i<c.length;i++)
		{System.out.print(c[i]+"\n");}
	}
	 
	 public static int[] result(int A, int B, int n, int[] e, int[] a) {
	        int N = 1009;
	        long[][] f = new long[N][N];
	        int[] s = new int[n + 1];
	        for (int i = 1; i <= n; ++i)
	            s[i] = s[i - 1] + a[n - i];
	        for (int i = 0; i < N; i++)
	            for (int j = 0; j < N; j++)
	                f[i][j] = 0x3f3f3f3f3f3f3f3fL;
	        f[0][0] = -0x3f3f3f3f3f3f3f3fL;
	        for (int i = 1; i <= n; ++i) {
	            for (int j = 0; j < s[i] + 1; ++j) {
	                f[i][j] = Math.min(1L + Math.max(0L, f[i - 1][j] + e[n - i]), // pass
	                        -(f[i - 1][s[i] - j + 1] - 1L) - e[n - i] // eat
	                );
	            }
	        }
	  
	        int[] z = new int[2];
	        for (int i = s[n]; i >= 0; --i) {
	            if (f[n][i] <= A - B) {
	                // System.out.println(i + " " + (s.get(n) - i));
	                z[0] = i;
	                z[1] = s[n] - i;
	                return z;
	            }
	        }
	        return new int[2];
	    }
	}

