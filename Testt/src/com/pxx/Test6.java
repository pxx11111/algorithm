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
	// 当结点非空时才进行操作 
	if (root != null) { 
		// 用于存放还未遍历的元素 
		Queue<BinaryTreeNode> list = new LinkedList<>(); // 将根结点入队 
		list.add(root); // 用于记录当前处理的结点
		BinaryTreeNode curNode; // 队列非空则进行处理
		while (!list.isEmpty()) { // 删除队首元素 
			curNode = list.remove(); // 输出队首元素的值 
			//System.out.println(curNode);
			System.out.print(curNode.value + " "); // 如果左子结点不为空，则左子结点入队 
			if (curNode.left != null) { list.add(curNode.left); } // 如果右子结点不为空，则左子结点入队
			if (curNode.right != null) { list.add(curNode.right); 
			} } } }
		
	}


