package com.pxx;

public class Test {
	public static void main(String[] args) {
		int arr[]=new int[]{3,3};
		int n=arr.length;
		Ni ni=new Ni();
		System.out.println(ni.chkStep(arr,n));
	}}

	// TODO Auto-generated method stub
class Ni{
 public int chkStep(int[] arr, int n) {
	if(n <= 0) return -1;
    if(arr.length != n) return -1;
    if(arr[n-1] == 2) return -1;  //�����Ǹ��̲����ܳ������м�ĸ���������
    return chk(arr,n,1,2,3);
}
 
private int chk(int[] arr, int n, int src, int mid, int des) {
    // TODO Auto-generated method stub
    if(n == 1){
        if(arr[n-1] == src) return 0;  //ֻ��һ��Բ�����ڵ�һ�������ϣ���ô���ǳ�ʼ״̬
        if(arr[n-1] == des) return 1;  //ֻ��һ��Բ�����ڵ����������ϣ���ô��������״̬
        return -1;  //ֻ��һ��Բ�̲������ڵڶ���������
    }
    if(arr[n - 1] == mid) return -1;  //�����Ǹ��̲����ܳ������м�ĸ���������
     
    //��ǰ������Ϊn,�����n�����ڵ�һ�������ϣ���˵����û���ƶ���������ֱ�ӿ���1~n-1���̵�������
    if(arr[n - 1] == src)
        return chk(arr,n-1,src,des,mid);
     
    //��ǰ����Ϊ��n���̣���ʼλ�ñ�Ӧ��from�ϵ�������״̬����to�ϣ�˵���䷢�����ƶ������ǰ��ƶ���Ϊ�����֣�
    //һ�����ǰ�1��n-1�Ƶ�pass�ϣ���n�����Ƶ�to�ϣ��ڶ�����Ϊ�����ƶ��������״̬��
    //���е�һ������Ҫ 1<<(n-1)�����ڶ��������ڴ�pass��from��toʱ�γɵ�һ������
    if(arr[n - 1] == des){
        int temp = chk(arr,n-1,mid,src,des);
        if(temp == -1)
            return -1;
        return (int) (temp + Math.pow(2, n-1));
    }
    return 0;

}}

