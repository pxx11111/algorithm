package cn.edu.jp.arraycopy;

import java.util.Arrays;

public class TestArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String sArray[] = {
        		            "hello",
        		            "world",
        		            "hello",
        		            "China"
                           };
        String dArray[] = new String[6];
        System.arraycopy(sArray, 0, dArray, 0, sArray.length);
        /*for(String str:dArray){
        	System.out.print(str+ " ");
        }*/
        Arrays.fill(sArray, 1, 3, "test");
        for(String str:sArray){
        	System.out.print(str+ " ");
        }
	}

}
