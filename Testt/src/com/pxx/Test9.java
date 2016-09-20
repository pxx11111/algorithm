package com.pxx;

public class Test9{ 
	/** * ������������� */ 
	public static class BinaryTreeNode 
	{ 
		int value; 
	BinaryTreeNode left; 
	BinaryTreeNode right; 
	} 
	/** * ��Ŀ������һ�ö��������������ö���������ת����һ�������˫������ 
	 * * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	 *  * * @param root �������ĸ���� 
	 *  * @return ˫�������ͷ��� */ 
	public static BinaryTreeNode convert(BinaryTreeNode root) 
	{ 
		// ���ڱ��洦������е�˫�������β���
		BinaryTreeNode[] lastNode = new BinaryTreeNode[1]; 
		convertNode(root, lastNode); // �ҵ�˫�������ͷ��� 
		BinaryTreeNode head = lastNode[0]; 
		while (head != null && head.left != null) 
		{ 
			head = head.left; 
			} 
		return head; 
			} 
	/** * �����ת������ * * 
	 * @param node ��ǰ�ĸ���� * 
	 * @param lastNode �Ѿ�����õ�˫�������β��㣬ʹ��һ������Ϊ1�����飬����C++�еĶ���ָ�� */ 
	public static void convertNode(BinaryTreeNode node, BinaryTreeNode[] lastNode) 
	{ // ��㲻Ϊ�� 
		if (node != null) 
		{ // ��������������ȴ��������� 
			if (node.left != null) 
			{ 
				convertNode(node.left, lastNode); 
				} // ����ǰ����ǰ��ָ���Ѿ�����õ�˫�������ɵ�ǰ�������������ɣ���β���
			node.left = lastNode[0]; // ���������ת���ɵ�˫������Ϊ�գ�����β���ĺ�� 
//			if (lastNode[0] != null)
//			{ 
//				lastNode[0].right = node;
//				} // ��¼��ǰ���Ϊβ���
//			lastNode[0] = node; // ���������� 
//			if (node.right != null) 
//			{ 
//				convertNode(node.right, lastNode); 
//				}
		} 
		} 
	public static void main(String[] args) 
	{ 
		test01(); 
	
	} 
	private static void printList(BinaryTreeNode head)
	{ 
		while (head != null) 
		{ 
			System.out.print(head.value + "->"); 
			head = head.right; } 
		System.out.println("null"); 
		} 
	private static void printTree(BinaryTreeNode root) 
	{ 
		if (root != null) 
		{ 
			printTree(root.left); 
			System.out.print(root.value + "->"); 
			printTree(root.right); 
			} 
		} // 10 // / \ // 6 14 // /\ /\ // 4 8 12 16 
	private static void test01() 
	{ 
		BinaryTreeNode node10 = new BinaryTreeNode(); 
		node10.value = 10; 
		BinaryTreeNode node6 = new BinaryTreeNode(); 
		node6.value = 6; 
		BinaryTreeNode node14 = new BinaryTreeNode(); 
		node14.value = 14; 
		BinaryTreeNode node4 = new BinaryTreeNode(); 
		node4.value = 4; 
		BinaryTreeNode node8 = new BinaryTreeNode(); 
		node8.value = 8; 
		BinaryTreeNode node12 = new BinaryTreeNode(); 
		node12.value = 12; 
		BinaryTreeNode node16 = new BinaryTreeNode(); 
		node16.value = 16; 
		node10.left = node6; 
		node10.right = node14; 
		node6.left = node4; 
		node6.right = node8; 
		node14.left = node12; 
		node14.right = node16; 
		System.out.print("Before convert: "); 
		printTree(node10); 
		System.out.println("null"); 
		BinaryTreeNode head = convert(node10); 
		System.out.print("After convert : "); 
		printList(head); 
		System.out.println(); 
		}
	}
	