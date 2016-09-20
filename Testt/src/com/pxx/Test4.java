package com.pxx;

import java.util.ArrayList;

import javax.print.attribute.standard.Finishings;

public class Test4 {
  public static void main(String[] args) {
	
	  int k=2;  
      ListNode head=new ListNode(0);  
      ListNode[] p=new ListNode[6];  
      for (int i = 0; i < p.length; i++) {  
          p[i]=new ListNode(i+1);  
          if(i>0)  
          p[i-1].next=p[i];  
          else {  
              head.next=p[0];  
          }  
      }  
      Solution l=new Solution();  
        
      ListNode r=l.FindKthToTail(head, k);  
      System.out.println(r.val);  
   
}}
class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
    	 if(k<=0) return null;
         ListNode p1 = head;
         ListNode p2 = head;
         //p2向前移动k个节点
         for(int i=0;i<k-1;i++) {
             if(p2==null) return null;
             p2 = p2.next;
         }
         if(p2==null) return null;
         while(p2.next!=null) {
             p1=p1.next;
             p2=p2.next;
         }
         return p1;
 
    }
    }

  class ListNode
{  int val;
   ListNode  next=null;
   ListNode(int val)
   {
	   this.val=val;
   }

	}
