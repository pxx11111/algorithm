package com.t20160822;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BianLiTree {
	
	    static class TreeNode{
	        int value;
	        TreeNode left;
	        TreeNode right;

	        public TreeNode(int value){
	            this.value=value;
	        }
	    }

	    
	    /**
	     * ���õݹ�ķ�ʽ����һ�Ŷ�����
	     * ������Ƕ������������ʾ��
	     * ������Ƕ������Ķ��������ʾ��
	     */
	    public static TreeNode makeBinaryTreeByArray(int[] array,int index){
	        if(index<array.length){
	            int value=array[index];
	            if(value!=0){
	                TreeNode t=new TreeNode(value);
	               // array[index]=0;
	                t.left=makeBinaryTreeByArray(array,index*2);
	                t.right=makeBinaryTreeByArray(array,index*2+1);
	                return t;
	            }
	           
	        }
	       
	        return null;
	    }

	    public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        if(root == null) return result;
	         
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	         
	        while (!queue.isEmpty()) {
	            ArrayList<Integer> arrayList = new ArrayList<Integer>();
	            int num = queue.size();
	            for (int i = 0; i < num; i++) {
	                TreeNode n = queue.poll();
	                arrayList.add(n.value);
	                if (n.left != null) {
	                    queue.add(n.left);
	                }
	                if (n.right != null) {
	                    queue.add(n.right);
	                }
	                }
	             
	            //һ��������� ����forѭ����ı��� ����result��0λ��
	            result.add(0,arrayList);//index at which the specified element is to be inserted
	        }
	         
	         
	        return result;
	    }
	    /** 
	     *                  13
	     *                 /  \
	     *               65    5
	     *              /  \    \
	     *             97  25   37
	     *            /    /\   /
	     *           22   4 28 32
	     */
	    public static void main(String[] args) {
	        int[] arr={0,13,65,5,97,25,0,37,22,0,4,28,0,0,32,0};
	       
	        TreeNode root=makeBinaryTreeByArray(arr,1);
		    ArrayList<ArrayList<Integer>>list=new ArrayList<>();

	        list=levelOrderBottom(root);
	       for (ArrayList<Integer> arrayList : list) {
		   for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		}
	    }
	}


