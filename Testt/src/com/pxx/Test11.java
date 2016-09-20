package com.pxx;

import java.util.Scanner;

public class Test11{
public static void main(String[] args) {

    Scanner sca=new Scanner(System.in); 
    int n=sca.nextInt();
   int []arr =new int[n];
    NQueens(arr, 0, n);

   
}
static void PrintResult(int[]arr,int n)
{
    for (int i=0; i!= n;++i)
         System.out.println("("+ i + ","+ arr[i]+ ")"+"");
     System.out.println();
}

public static boolean Verify(int[]arr,int i)
{
    /* 和前面的i - 1行比较，看当前放置位置是否合法？*/
    for (int k = 0; k != i;++k)
        if (arr[k]== arr[i]|| Math.abs(i - k)== Math.abs(arr[i]- arr[k]))
            return false;
    return true;
}
/* 虽然只用了一个一维数组，但是其中已经保存了足够的信息。
因为每一行只能放一个皇后，所以一维数组的第i个位置存放的
是在第i行的哪一列（第j列）上放置了皇后。这个递归函数
每次处理一行，直到第n行（下标从1开始）。*/
public static void NQueens(int[] arr,int i, int n)
{
    /* 尝试着在第i行的第j列放置一个皇后。*/
    for (int j = 0; j != n;++j)
     {
         arr[i] = j;
        if (Verify(arr, i))
         {
            /* 这个递归程序的结束条件是第n行放置完毕，
             所以，当递归函数从调用NQueens(arr, i + 1, n)返回时，
             就是回到了第i行，继续搜索合适的位置。当第i + 1行的
             所有位置都不能满足的时候，上面的调用就会返回，也就
             是进行了所谓的回溯。这个回溯不需要显示的恢复以前的
             调用环境，因为所需要的信息没有被破坏。*/
            if (i== n-1)
                 PrintResult(arr, n);
            else
                 NQueens(arr, i +1, n);//下一行放置皇后
         }
     }
}


}
