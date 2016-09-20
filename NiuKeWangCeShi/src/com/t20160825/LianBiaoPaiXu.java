package com.t20160825;

public class LianBiaoPaiXu {
	public static class ListNode 
	{ 
		int value; // 结点的值 
		ListNode next; // 下一个结点
		ListNode(int x) {
			       value = x;
			        next = null;
			     }
		}
	public static ListNode insertionSortList(ListNode head) {
        if(head == null)     
            return null;   
        ListNode helper = new ListNode(0);   
        ListNode pre =helper;
        ListNode cur = head;   
        while(cur!=null)   
        {     
            ListNode next = cur.next;     
            pre = helper;     
            while(pre.next!=null && pre.next.value<cur.value)     
            {       
                pre = pre.next;     
            }     
            cur.next = pre.next;     
            pre.next = cur;     
            cur = next;   
        }   
        return helper.next;
    }
	public static void printList(ListNode head) 
	{ 
		while (head != null) 
		{ 
			System.out.print(head.value + "->"); 
			head = head.next; 
			} System.out.println("null"); 
			} 
	public static void main(String[] args)
	{ 
		ListNode head = new ListNode(1); 
	    head.next = new ListNode(2); 
		head.next.next = new ListNode(3); 
		head.next.next.next = new ListNode(4); 
		head.next.next.next.next = new ListNode(6); 
        head.next.next.next.next.next = new ListNode(5); 
	    head.next.next.next.next.next.next = new ListNode(7); 
        head.next.next.next.next.next.next.next = new ListNode(8); 
        head.next.next.next.next.next.next.next.next = new ListNode(9); 
      ListNode listnode=insertionSortList(head);
	   printList(listnode);
	}
	
}
