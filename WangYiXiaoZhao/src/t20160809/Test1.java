package t20160809;

import java.util.Scanner;

public class Test1 {
	
	    public static int[][] bitArray(int[] arr){
	        int[][] res=new int[arr.length][32];
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<32;j++){
	                res[i][j]=(arr[i]>>(31-j))&1;
	            }
	        }
	        return res;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        while(sc.hasNext()){
	            int n=sc.nextInt();
	            int[] arr=new int[n];
	            for(int i=0;i<n;i++){
	               arr[i]=sc.nextInt();
	            }
	            int [][]bitMetrix=bitArray(arr);
	            int i=0, j=0, k=0,col=0;
	            for( k=0;k<n&&col<32;k++,col++){//һ����n�θ�˹��Ԫ(k�����k����Ԫ)
	                for( i=k;i<n && bitMetrix[i][col]==0;i++);//�ڵ�k����Ԫ�У��ҵ���col�еĵ�һ������Ԫ����λ�ã���i����¼����λ��
	                if(i==n){
	                    k--;
	                    continue;
	                }
	                for(j=0;j<32;j++){//�������м���i�����k�н���λ�ã���֤��k�е�col�еĵ�һ��Ԫ�ط��㣩
	                    int temp=bitMetrix[i][j];
	                    bitMetrix[i][j]=bitMetrix[k][j];
	                    bitMetrix[k][j]=temp;
	                }
	                for( i=k+1;i<n;i++){
	                    if(bitMetrix[i][col]==0){
	                        continue;
	                    }
	                    for(j=col;j<32;j++){
	                        bitMetrix[i][j]^=bitMetrix[k][j];
	                    }
	                }
	 
	            }
	            System.out.println(k);
	             
	             
	        }
	        sc.close();
	    }

}