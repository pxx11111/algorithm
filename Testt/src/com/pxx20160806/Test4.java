package com.pxx20160806;

public class Test4 {
public static void main(String[] args) {
	int []pData={8,9,6,5,7,4,2,1,3};
	OddEvenSort(pData, pData.length);
	for (int i : pData) {
		System.out.print(i+" ");
	}
	
}
//�ж��Ƿ�Ϊ����
public static boolean IsOddNumber(int data)
{
  return (data & 1) == 1;
}

//��ż����
public static void OddEvenSort(int []pData,  int length)
{
  if (pData==null || length == 0)
      return;

  int pBegin = 0;
  int pEnd = pData.length - 1;

  while (pBegin < pEnd)
  {
      //���pBeginָ��ָ�����������������������
      if (IsOddNumber(pData[pBegin]))  
      {
          pBegin++;
      }
      //���pEndָ��ָ�����ż����������������
      else if (!IsOddNumber(pData[pEnd]))
      {
          pEnd--;
      }
      else
      {
          //���򶼲�����������
          //swap��STL�⺯��������Ϊvoid swap(int& a, int& b);
          swap(pData,pBegin, pEnd);
      }
  }
}
public static void swap(int []pDara,int pBegin,int PEnd)
{
  int temp=pDara[pBegin];
  pDara[pBegin]=pDara[PEnd];
  pDara[PEnd]=temp;
}
}
