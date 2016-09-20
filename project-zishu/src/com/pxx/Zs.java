package com.pxx;

import java.util.LinkedList;
import java.util.List;


public class Zs {
	 private static List<TreeNode> nodeList = null;  
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array2 = { 1,2, 3, 4, 5, 6, 7, 8 };
		
		 createBinTree(array1); 
		 TreeNode root = nodeList.get(0); 
		 createBinTree(array2);
		 TreeNode root2 = nodeList.get(0); 
         // nodeList�е�0����������ֵ��Ϊ���ڵ�  
         
         Solution so=new Solution();
         System.out.println(so.HasSubtree(root, root2));
	}
	public static void createBinTree(int []array) {  
        nodeList = new LinkedList<TreeNode>();  
        // ��һ�������ֵ����ת��ΪNode�ڵ�  
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {  
            nodeList.add(new TreeNode(array[nodeIndex]));  
        }  
        // ��ǰlastParentIndex-1�����ڵ㰴�ո��ڵ��뺢�ӽڵ�����ֹ�ϵ����������  
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {  
            // ����  
            nodeList.get(parentIndex).left = nodeList  
                    .get(parentIndex * 2 + 1);  
            // �Һ���  
            nodeList.get(parentIndex).right = nodeList  
                    .get(parentIndex * 2 + 2);  
        }  
        // ���һ�����ڵ�:��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե����ó�������  
        int lastParentIndex = array.length / 2 - 1;  
        // ����  
        nodeList.get(lastParentIndex).left = nodeList  
                .get(lastParentIndex * 2 + 1);  
        // �Һ���,�������ĳ���Ϊ�����Ž����Һ���  
        if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).right = nodeList  
                    .get(lastParentIndex * 2 + 2);  
        }  
    }  
		
	}
	 class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
     class Solution {
	    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	        if (null == root2) {
	            // ��ʵ����Ӧ�÷���true��������������������
	            return false;
	        }
	        if (null == root1) {
	            return false;
	        }
	        boolean flag = false;
	        if (root1 != null && root2 != null) {
	            if (root1.val == root2.val) {
	                flag = doesTree1HaveTree2(root1, root2);
	            }
	            if (!flag) {
	                return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
	            }
	        }
	        return flag;
	    }
	     
	    private boolean doesTree1HaveTree2(TreeNode root1, TreeNode root2) {
	        if (root2 == null) {
	            return true;
	        }
	        if (root1 == null) {
	            return false;
	        }
	        if (root1.val != root2.val) {
	            return false;
	        } else {
	            return doesTree1HaveTree2(root1.left, root2.left) && doesTree1HaveTree2(root1.right, root2.right);
	        }
	    }


}
