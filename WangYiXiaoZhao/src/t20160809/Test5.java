package t20160809;

public class Test5 {
public static void main(String[] args) {
	int []arr=new int[]{6,2,4,1,5,9};
	sort(arr);
}
public static void sort(int []arr)
{
	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length; j++) {
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			for (int j1 : arr) {
				
			
			System.out.print(j1);
			}
			System.out.println();
		}
	}
}
}
