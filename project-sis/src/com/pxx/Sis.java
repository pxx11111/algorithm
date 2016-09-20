package com.pxx;

import java.io.Console;

public class Sis {
	/// <summary>
    /// ≤Â»Î≈≈–Ú
    /// </summary>
    /// <param name="unsorted"></param>
    public static void insertion_sort(int[] unsorted)
    {
        for (int i = 1; i < unsorted.length; i++)
        {
            if (unsorted[i - 1] > unsorted[i])
            {
                int temp = unsorted[i];
                int j = i;
                while (j > 0 && unsorted[j - 1] > temp)
                {
                    unsorted[j] = unsorted[j - 1];
                    j--;
                }
                unsorted[j] = temp;
            }
            for(int s:unsorted)
            {
                if (s > 0)
                    System.out.print(s + ",");
            }
            System.out.println();
        }
    }

   public static void main(String[] args) 
	

    {
        int[] x = { 6, 2, 4, 1, 5, 9 };
        insertion_sort(x);
        for(int s:x)
        {
            if (s > 0)
                System.out.print(s + ",");
        }
        System.out.println();
    }
}
