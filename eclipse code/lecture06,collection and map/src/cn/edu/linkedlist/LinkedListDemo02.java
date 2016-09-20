package cn.edu.linkedlist;

import java.util.LinkedList ;
public class LinkedListDemo02{
	public static void main(String args[]){
		LinkedList<String> link = new LinkedList<String>() ;
		link.add("A") ;	// 增加元素
		link.add("B") ;	// 增加元素
		link.add("C") ;	// 增加元素
		System.out.println("1-1、element()方法找到表头：" + link.element()) ;
		System.out.println("1-2、找完之后的链表的内容：" + link) ;
		System.out.println("2-1、peek()方法找到表头：" + link.peek()) ;
		System.out.println("2-2、找完之后的链表的内容：" + link) ;
		System.out.println("3-1、poll()方法找到表头：" + link.poll()) ;
		System.out.println("3-2、找完之后的链表的内容：" + link) ;
		
	}
};
