package cn.edu.linkedlist;

import java.util.LinkedList ;
public class LinkedListDemo02{
	public static void main(String args[]){
		LinkedList<String> link = new LinkedList<String>() ;
		link.add("A") ;	// ����Ԫ��
		link.add("B") ;	// ����Ԫ��
		link.add("C") ;	// ����Ԫ��
		System.out.println("1-1��element()�����ҵ���ͷ��" + link.element()) ;
		System.out.println("1-2������֮�����������ݣ�" + link) ;
		System.out.println("2-1��peek()�����ҵ���ͷ��" + link.peek()) ;
		System.out.println("2-2������֮�����������ݣ�" + link) ;
		System.out.println("3-1��poll()�����ҵ���ͷ��" + link.poll()) ;
		System.out.println("3-2������֮�����������ݣ�" + link) ;
		
	}
};
