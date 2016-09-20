package myproject;


import java.util.*;
 
public class My {
    public static void main(String[] args) {
    	
    		
    	       Scanner sca=new Scanner(System.in);
    	       String s=sca.nextLine();
    	       int n=sca.nextInt();
    	       String m=trans(s,n);
    	       System.out.println(m);
    		}

    		public static String trans(String s, int n) 
    		{ if (s != null && (n >= 1 && n <= 500))
    		{ char[] str = s.toCharArray(); 
    		s = "";
    		boolean containsBlank = false; 
    		Stack<String> stack = new Stack<String>();
    		int k = 0; int j = 0; 
    		for (j = 0; j < str.length; j++) 
    		{ 
    			if (str[j] != ' ' && (str[j] >= 'A' && str[j] <= 'Z'))
    			{ str[j] = (char) (str[j] + 32); }
    			else if (str[j] != ' ' && (str[j] >= 'a' && str[j] <= 'z')) 
    			{ str[j] = (char) (str[j] - 32); } 
    			if (str[j] == ' ') 
    			{ stack.push(new String(str, k, j - k) + (k == 0? "" : " ")); 
    			k = j + 1; containsBlank = true; } } 
    		if (!containsBlank) 
    			stack.push(String.valueOf(str)); 
    		else stack.push(new String(str, k, j - k) + " ");
    		while (stack.size() != 0) { s += stack.pop();
    		} 
    		} 
    		return s; 
    		}

    	

    }


 
