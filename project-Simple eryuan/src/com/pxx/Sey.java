package com.pxx;

public class Sey {
	public static void SelectSort(int r[],int n) {
		int i ,j , min ,max, tmp;
		for (i=1 ;i <= n/2;i++) {  
			// ��������n/2��ѡ������ 
			min = i; max = i ; //�ֱ��¼������С�ؼ��ּ�¼λ��
			for (j= i+1; j<= n-i; j++) {
				if (r[j] > r[max]) { 
					max = j ; continue ; 
				}  
				if (r[j]< r[min]) { 
					min = j ; 
				}   
		  }  
		  //�ý����������ɷ�������������Ч��
		  tmp = r[i-1]; r[i-1] = r[min]; r[min] = tmp;
		  tmp = r[n-i]; r[n-i] = r[max]; r[max] = tmp; 
		  print(r,  n , i);
		} 
		
	}
	public static void print(int a[], int n ,int i){
		System.out.println("��"+(i+1 )+"�� : ");
		for(int j= 0; j<8; j++){
			System.out.print(a[j]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		
		int a[] = {3,1,5,7,2,4,9,6};
		System.out.println("��ʼֵ��");
		for(int j= 0; j<8; j++){
			System.out.print(a[j] +"  ");
		}
		System.out.println('\n');
		SelectSort(a, 8);
		print(a,8,8);
	}
}
