package com.t20160825;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LianBiaoHeBing {
	public static class ListNode 
	{ 
		int value; // 结点的值 
		ListNode next; // 下一个结点
		ListNode(int x) {
			       value = x;
			        next = null;
			     }
		}
	public static ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size()==0||lists==null)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                return l1.value-l2.value;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
         
        for(ListNode node:lists)
            if(node!=null)
               queue.add(node);
             
         while(!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;
             
            if(tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
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
		ListNode  head2= new ListNode(2); 
		ListNode head3= new ListNode(3); 
		ListNode head4= new ListNode(4); 
		ListNode head5 = new ListNode(6); 
		ListNode head6 = new ListNode(5); 
		ListNode head7= new ListNode(7); 
		ListNode  head8= new ListNode(8); 
		ListNode head9 = new ListNode(9); 
        
        ArrayList<ListNode>arr=new ArrayList<>();
        arr.add(head);
        arr.add(head2);
        arr.add(head3);
        arr.add(head4);
        arr.add(head5);
        arr.add(head6);
        arr.add(head7);
        arr.add(head8);
        arr.add(head9);
      ListNode listnode=mergeKLists(arr);
	   printList(listnode);
	}
	
}
