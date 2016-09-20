package com.pxx20160806;

import java.util.Scanner;

public class Test2{

public static void main(String[] args) {

    Scanner sca=new Scanner(System.in); 
    int m=sca.nextInt();
    int n=sca.nextInt();
    NQueens(0, 0, m,n);

   
}
static void PrintResult(int m,int n)
{
    for (int i=0; i< m;i++)
    	for(int j=0;j<n;j++)
         System.out.println("("+ i + ","+ j+ ")"+"");
     System.out.println();
}

public static boolean Verify(int i,int j)
{
    /* ��ǰ���i - 1�бȽϣ�����ǰ����λ���Ƿ�Ϸ���*/
    for (int k = 0; k <i;k++){
    	for(int f=0;f<j;f++)
    	{
    	int num=(i-k)*(i-k)+(j-f)*(j-f);
    	double num1=Math.sqrt(num);
        if (num1==2)
            return false;}
    }
    return true;
}
/* ��Ȼֻ����һ��һά���飬���������Ѿ��������㹻����Ϣ��
��Ϊÿһ��ֻ�ܷ�һ���ʺ�����һά����ĵ�i��λ�ô�ŵ�
���ڵ�i�е���һ�У���j�У��Ϸ����˻ʺ�����ݹ麯��
ÿ�δ���һ�У�ֱ����n�У��±��1��ʼ����*/
public static void NQueens(int row,int col, int m,int n)
{
    /* �������ڵ�i�еĵ�j�з���һ���ʺ�*/
	for (int i = 0; i < m; i++) {
		
	
    for (int j = 0; j<n;j++)
     {
         
        if (Verify(i,j ))
         {
            /* ����ݹ����Ľ��������ǵ�n�з�����ϣ�
             ���ԣ����ݹ麯���ӵ���NQueens(arr, i + 1, n)����ʱ��
             ���ǻص��˵�i�У������������ʵ�λ�á�����i + 1�е�
             ����λ�ö����������ʱ������ĵ��þͻ᷵�أ�Ҳ��
             �ǽ�������ν�Ļ��ݡ�������ݲ���Ҫ��ʾ�Ļָ���ǰ��
             ���û�������Ϊ����Ҫ����Ϣû�б��ƻ���*/
            if (i== n-1)
                 PrintResult(m, n);
            else
                 NQueens(row+1, col+1 , m,n);//��һ�з��ûʺ�
         }
     }}
}


}
