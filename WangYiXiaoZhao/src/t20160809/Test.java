package t20160809;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
Scanner sca=new Scanner(System.in);
int w=sca.nextInt();
int h=sca.nextInt();
System.out.println(count(w,h));
}
public static int count(int w,int h)
{   int [][]arr=new int[1004][1004];
int count=0;
	for (int i = 0; i < w; i++) {
		for (int j = 0; j < h; j++) {
			arr[i][j]=0;
		}
	}
	for (int i = 2; i <w+2 ; i++) {
		for (int j = 2; j < h+2&&arr[i][j]==0; j++) {
			if((arr[i][j-2]==0)&&(arr[i][j+2]==0)&&(arr[i-2][j]==0)&&(arr[i+2][j])==0)
			{
				arr[i][j]=1;
				count++;
			}
		}
	}
	return count;
}
}
