package t20160809;

import java.util.Scanner;
public class Test2{
     
    public static int count;
 
    public static void method(int[] num,int n,int pos,int sum,int mul){
        if(pos!=0){
            if(sum>mul){
                count++;
            }else if(sum<mul){
                return;
            }
        }
        for(int i=pos;i<n;i++){
            sum+=num[i];
            mul*=num[i];
            method(num,n,i+1,sum,mul);
            sum-=num[i];
            mul/=num[i];
            while(i<n-1 && num[i]==num[i+1]){
                i++;
            }
        }
         
    }
 
    public static void main(String[] args){
         
        Scanner scan=new Scanner(System.in);
         
        while(scan.hasNextInt()){
            int n=scan.nextInt();
            int[] need=new int[n];
            for(int i=0;i<n;i++){
                need[i]=scan.nextInt();
            }
            count=0;
            method(need,need.length,0,0,1);
            System.out.println(count);
        }
    }
}
