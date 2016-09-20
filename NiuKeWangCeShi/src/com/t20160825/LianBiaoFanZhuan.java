package com.t20160825;

public class LianBiaoFanZhuan {
	public static class ListNode 
	{ 
		int value; // ����ֵ 
		ListNode next; // ��һ�����
		ListNode(int x) {
			       value = x;
			        next = null;
			     }
		}
	public static ListNode reverse(ListNode head,ListNode tail)
    {
    ListNode pre=head;
    ListNode cur=head.next;
    ListNode ne=null;
    while(pre!=tail)
        {
        ne=cur.next;
        cur.next=pre;
        pre=cur;
        cur=ne;
    }
    head.next=null;
    head=pre;
    return head;
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
        ListNode tail= head.next.next.next.next.next.next.next.next;
      ListNode listnode=reverse(head, tail);
	   printList(listnode);
	}
}
