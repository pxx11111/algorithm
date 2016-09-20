package t20160809;

public class Test3 {
	
	    public static void main(String[] args) {
	        int[] input = {6,4,2,2,5,6,1};
	        int[] record = new int[input.length];
	        int key = 10;
	        backtrack(input, record, key, 0, 0);
	    }
	 
	    public static void backtrack(int[] input,int[] record,int key,int sum,int n) {
	        if(n == input.length){
	            return;
	        }else{
	            for(int i=0; i<=1; i++){
	                sum += i*input[n];
	                record[n] = i;
	                if(sum == key){
	                    for(int j=0; j<=n; j++){
	                        if(record[j]==1)
	                            System.out.print(input[j]);
	                    }
	                    System.out.println();
	                }
	                if(sum<key){
	                    backtrack(input, record, key, sum, n+1);
	                }
	                sum -= i*input[n];
	            }
	        }
	    
}}