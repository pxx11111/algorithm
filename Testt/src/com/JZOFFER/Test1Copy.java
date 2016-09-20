package com.JZOFFER;

public class Test1Copy {
		public static void main(String[] args) {
        System.out.println( movingCount(18, 40, 40));
		}

		public static int movingCount(int threshold, int rows, int cols) {
         if(threshold<0&&rows<1&&cols<1)
         {
        	 return 0;
         }
         boolean visited[]=new boolean[rows*cols];
         for (int i = 0; i < visited.length; i++) {
			visited[i]=false;
		}
         return movingcount(threshold,rows,cols,0,0,visited);
		}
		public static int movingcount(int threshold,int rows,int cols,int row,int col,boolean []visited)
		{    int count=0;
			if(check(threshold,rows,cols,row,col,visited ))
			{    
				  visited[row * cols + col] = true;
		            count = 1
		                    + movingcount(threshold, rows, cols, row - 1, col, visited)
		                    + movingcount(threshold, rows, cols, row, col - 1, visited)
		                    + movingcount(threshold, rows, cols, row + 1, col, visited)
		                    + movingcount(threshold, rows, cols, row, col + 1, visited);
			}
			return count;
		}
		public static boolean check(int threshold,int rows,int cols,int row,int col,boolean[]visited) 
		{
			return row>1&&col>1&&row<rows&&col<cols&&!visited[cols*row+col]&&getdigitsum(row)+getdigitsum(col)<=threshold;
	    }
		public static int getdigitsum(int n)
		{
			String str=String.valueOf(n);
			
			int num=0;
			 
			int []intarr=new int[str.length()];
			for (int i = 0; i < intarr.length; i++) {
				intarr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
				num=intarr[i]+num;
			}
			return num;
		}
	}

