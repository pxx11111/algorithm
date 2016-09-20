

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
        
      head =l.ReverseList(head);  
      while(head != null){
 		 System.out.print(head.val);
 		 head = head.next;
 		 }
   
}}
class Solution {
	public ListNode ReverseList(ListNode head) {
    ListNode pre = null;
    ListNode next = null;
    while (head != null) {
        next = head.next;
        head.next = pre;
        pre = head;
        head = next;
    } return pre;
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
