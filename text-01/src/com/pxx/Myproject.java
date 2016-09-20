package com.pxx;

import java.util.*;

public class Myproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int T = in.nextInt();
            String[] str = new String[T];
            for(int i = 0;i<T;i++){
                str[i] = in.next();
            }
            for(int i = 0;i<T;i++){
                for(int j = 0;j<str[i].length();j++){
                    String aa = str[i].substring(j,j+1);
                    if(str[i].indexOf(aa)==str[i].lastIndexOf(aa)){
                        System.out.println(aa);
                        j = str[i].length();
                    
                
            
        }
    }
}

		}
	}

}
