package com.pxx;

public class SSS {
	public static void print(int a[], int n ,int i){
		System.out.println("��"+(i+1 )+"�� : ");
		for(int j= 0; j<8; j++){
			System.out.print(a[j]+"  ");
		}
		System.out.println();
	}
	/**
	 * �������Сֵ
	 *
	 * @return int ����ļ�ֵ
	 */
	 public static int SelectMinKey(int a[], int n, int i)
	{
		int k = i;
		for(int j=i+1 ;j< n; ++j) {
			if(a[k] > a[j]) k = j;
		}
		return k;
	}

	/**
	 * ѡ������
	 *
	 */
	public static void selectSort(int a[], int n){
		int key, tmp;
		for(int i = 0; i< n; ++i) {
			key = SelectMinKey(a, n,i);           //ѡ����С��Ԫ��
			if(key != i){
				tmp = a[i];  a[i] = a[key]; a[key] = tmp; //��СԪ�����iλ��Ԫ�ػ���
			}
			print(a,  n , i);
		}
	}
	public static void main(String[] args) {
		
	
		int a[] = {3,1,5,7,2,4,9,6};
		System.out.println("��ʼֵ��");
		for(int j= 0; j<8; j++){
			System.out.print(a[j] +"  ");
		}
		System.out.println('\n');
		selectSort(a, 8);
		print(a,8,8);
	}

}
