package com.pxx20160806;

public class Test4 {
public static void main(String[] args) {
	int []pData={8,9,6,5,7,4,2,1,3};
	OddEvenSort(pData, pData.length);
	for (int i : pData) {
		System.out.print(i+" ");
	}
	
}
//判断是否为奇数
public static boolean IsOddNumber(int data)
{
  return (data & 1) == 1;
}

//奇偶互换
public static void OddEvenSort(int []pData,  int length)
{
  if (pData==null || length == 0)
      return;

  int pBegin = 0;
  int pEnd = pData.length - 1;

  while (pBegin < pEnd)
  {
      //如果pBegin指针指向的是奇数，正常，向右移
      if (IsOddNumber(pData[pBegin]))  
      {
          pBegin++;
      }
      //如果pEnd指针指向的是偶数，正常，向左移
      else if (!IsOddNumber(pData[pEnd]))
      {
          pEnd--;
      }
      else
      {
          //否则都不正常，交换
          //swap是STL库函数，声明为void swap(int& a, int& b);
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
