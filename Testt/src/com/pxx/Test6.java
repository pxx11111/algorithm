package com.pxx;

import java.util.LinkedList;
import java.util.Queue;

public class Test6 {
	public static class BinaryTreeNode 
	{ int value; 
	BinaryTreeNode left; 
	BinaryTreeNode right; }
public static void main(String[] args) {
	BinaryTreeNode root = new BinaryTreeNode(); 
	root.value = 8; 
	root.left = new BinaryTreeNode(); 
	root.left.value = 6; 
	root.left.left = new BinaryTreeNode(); 
	root.left.left.value = 5; 
	root.left.right = new BinaryTreeNode(); 
	root.left.right.value = 7; 
	root.right = new BinaryTreeNode(); 
	root.right.value = 10; 
	root.right.left = new BinaryTreeNode(); 
	root.right.left.value = 9; 
	root.right.right = new BinaryTreeNode(); 
	root.right.right.value = 11;
	printFromToBottom(root);
}
public static void printFromToBottom(BinaryTreeNode root) { 
	// �����ǿ�ʱ�Ž��в��� 
	if (root != null) { 
		// ���ڴ�Ż�δ������Ԫ�� 
		Queue<BinaryTreeNode> list = new LinkedList<>(); // ���������� 
		list.add(root); // ���ڼ�¼��ǰ����Ľ��
		BinaryTreeNode curNode; // ���зǿ�����д���
		while (!list.isEmpty()) { // ɾ������Ԫ�� 
			curNode = list.remove(); // �������Ԫ�ص�ֵ 
			//System.out.println(curNode);
			System.out.print(curNode.value + " "); // ������ӽ�㲻Ϊ�գ������ӽ����� 
			if (curNode.left != null) { list.add(curNode.left); } // ������ӽ�㲻Ϊ�գ������ӽ�����
			if (curNode.right != null) { list.add(curNode.right); 
			} } } }
		
	}


