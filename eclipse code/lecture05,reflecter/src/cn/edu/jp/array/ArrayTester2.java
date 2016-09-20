package cn.edu.jp.array;

import java.lang.reflect.Array;

public class ArrayTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
       int dims[] = new int[]{5,10};
       Object array = Array.newInstance(Integer.TYPE, dims);
       Object arrayObj = Array.get(array, 3);
       Class cls = arrayObj.getClass().getComponentType();
       System.out.println(cls);
       
       Array.set(arrayObj, 5, 37);
        
       int arrayCast[][] = (int[][])array;
       
       System.out.println(arrayCast[3][5]);
       for(int i=0;i<arrayCast.length;i++)
    	   for(int j = 0;j<arrayCast[i].length;j++)
    		   arrayCast[i][j] = j;
       System.out.println();
       for(int i=0;i<arrayCast.length;i++){
    	   for(int j = 0;j<arrayCast[i].length;j++)
    		   System.out.print(" " + arrayCast[i][j]);
    	   System.out.println();
       }
	}
}
