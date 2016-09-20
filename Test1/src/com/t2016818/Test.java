package com.t2016818;

public class Test {
     public static void main(String[] args) {
		
		int []a={2,7,9,4,1};
		System.out.println(maxArea(a));
	}
      public static int maxArea(int []h) {  
            // Start typing your C/C++ solution below  
            // DO NOT write int main() function  
            int res=0;  
            int n = h.length;  
            int l=0,r=n-1;  
            while(l<r)  
            {  
                res=Math.max(res,Math.min(h[l],h[r])*(r-l));  
                if (h[l]<h[r])  
                {  
                    int k=l;  
                    while(k<r&&h[k]<=h[l])  
                        k++;  
                    l=k;  
                    }  
                else  
                {  
                    int k=r;  
                    while(k>l&&h[k]<=h[r])  
                        k--;  
                    r=k;  
                 }  
            }  
            return res;  
        }  
}

