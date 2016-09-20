package com.pxx;

import java.util.Scanner;

public class Test10 {
public static void main(String[] args) {

    Scanner sca=new Scanner(System.in); 
    int n=sca.nextInt();
   int []arr =new int[n +1];
    NQueens(arr, 1, n);

   
}
static void PrintResult(int[]arr,int n)
{
    for (int i=1; i!= n+ 1;++i)
         System.out.println("("+ i + ","+ arr[i]+ ")"+"");
     System.out.println();
}

public static boolean Verify(int[]arr,int i)
{
    /* ��ǰ���i - 1�бȽϣ�����ǰ����λ���Ƿ�Ϸ���*/
    for (int k = 1; k != i;++k)
        if (arr[k]== arr[i]|| Math.abs(i - k)== Math.abs(arr[i]- arr[k]))
            return false;
    return true;
}
/* ��Ȼֻ����һ��һά���飬���������Ѿ��������㹻����Ϣ��
��Ϊÿһ��ֻ�ܷ�һ���ʺ�����һά����ĵ�i��λ�ô�ŵ�
���ڵ�i�е���һ�У���j�У��Ϸ����˻ʺ�����ݹ麯��
ÿ�δ���һ�У�ֱ����n�У��±��1��ʼ����*/
public static void NQueens(int[] arr,int i, int n)
{
    /* �������ڵ�i�еĵ�j�з���һ���ʺ�*/
    for (int j = 1; j != n+1;++j)
     {
         arr[i] = j;
        if (Verify(arr, i))
         {
            /* ����ݹ����Ľ��������ǵ�n�з�����ϣ�
             ���ԣ����ݹ麯���ӵ���NQueens(arr, i + 1, n)����ʱ��
             ���ǻص��˵�i�У������������ʵ�λ�á�����i + 1�е�
             ����λ�ö����������ʱ������ĵ��þͻ᷵�أ�Ҳ��
             �ǽ�������ν�Ļ��ݡ�������ݲ���Ҫ��ʾ�Ļָ���ǰ��
             ���û�������Ϊ����Ҫ����Ϣû�б��ƻ���*/
            if (i== n)
                 PrintResult(arr, n);
            else
                 NQueens(arr, i +1, n);//��һ�з��ûʺ�
         }
     }
}


}
