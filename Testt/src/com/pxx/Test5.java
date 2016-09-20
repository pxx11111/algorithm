package com.pxx;

import java.util.Stack;

public class Test5 {
	public static void main(String[] args) {
		
	}
  public boolean IsPopOrder(int [] pushA,int [] popA) {
	  if(pushA.length==0||popA.length==0)
		  return false;
	  Stack<Integer> stack=new Stack<>();
	  for(int i=0;i<pushA.length;i++)
	  {   int j=0;
		  stack.push(pushA[i]);
		  while(j<popA.length&&stack.peek().equals(popA[j])){
			  stack.pop();
			  j++;
		  }
		  
	  }
	return stack.empty()?true:false;
}
  }
