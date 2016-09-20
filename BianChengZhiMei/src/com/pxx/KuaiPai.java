package com.pxx;

public class KuaiPai {
	static void Qsort(int a[], int low, int high)
	{
	    if(low >= high)
	    {
	        return;
	    }
	    int first = low;
	    int last = high;
	    int key = a[first];/*���ֱ��ĵ�һ����¼��Ϊ����*/
	 
	    while(first < last)
	    {
	        while(first < last && a[last] >= key)
	        {
	            --last;
	        }
	 
	        a[first] = a[last];/*���ȵ�һ��С���Ƶ��Ͷ�*/
	 
	        while(first < last && a[first] <= key)
	        {
	            ++first;
	        }
	         
	        a[last] = a[first];    
	/*���ȵ�һ������Ƶ��߶�*/
	    }
	    a[first] = key;/*�����¼��λ*/
	    Qsort(a, low, first-1);
	    Qsort(a, first+1, high);
	}
	public static void main(String[] args) 
	{
	    int a[] = {57, 68, 59, 52, 72, 28, 96, 33, 24};
	 
	    Qsort(a, 0, a.length - 1);/*����ԭ�ĵ���������Ҫ��1�����ڴ�Խ��*/
	 
	    for(int i = 0; i < a.length; i++)
	    {
	       System.out.print( a[i]+" "); 
	    }
	     
	    
	}
}