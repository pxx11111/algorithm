package com.pxx;

public class Shellsort {
	public static void print(int a[], int n ,int i){
		System.out.println(i+":");
		for(int j= 0; j<8; j++){
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	/**
	 * ֱ�Ӳ��������һ����ʽ
	 *
	 * @param int dk ��С�����������ֱ�Ӳ�������dk=1
	 *
	 */

	public static void ShellInsertSort(int a[], int n, int dk)
	{
		for(int i= dk; i<n; ++i){
			if(a[i] < a[i-dk]){			//����i��Ԫ�ش���i-1Ԫ�أ�ֱ�Ӳ��롣С�ڵĻ����ƶ����������
				int j = i-dk;	
				int x = a[i];			//����Ϊ�ڱ������洢������Ԫ��
				a[i] = a[i-dk];			//���Ⱥ���һ��Ԫ��
				while(x < a[j]&&j>dk){		//�����������Ĳ���λ��
					a[j+dk] = a[j];
					j -= dk;			 //Ԫ�غ���
				}
				a[j+dk] = x;			//���뵽��ȷλ��
			}
			print(a, n,i );
		}
		
	}

	/**
	 * �Ȱ�����d��n/2,nΪҪ�������ĸ�������ϣ������
	 *
	 */
	public static void shellSort(int a[], int n){

		int dk = n/2;
		while( dk >= 1  ){
			ShellInsertSort(a, n, dk);
			dk = dk/2;
		}
	}
	public static void main(String[] args) {
		
	
		int a[] = {3,1,5,7,2,4,9,6};
		//ShellInsertSort(a,8,1); //ֱ�Ӳ�������
		shellSort(a,8);			  //ϣ����������
		print(a,8,8);
	}

}
