package com.pxx;

import java.util.ArrayList;

public class Test1 {
	
static class TreeNode{
	int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
		// TODO Auto-generated constructor stub
    	this.val=val;
	}
}
public static TreeNode makebinarytree(int []array,int index)
{
	if(index<array.length){
		int value=array[index];
		if(value!=0)
		{
			TreeNode t=new TreeNode(value);
			t.left=makebinarytree(array, index*2);
			t.right=makebinarytree(array, index*2+1);
			return t;
		}
	}
	return null;
	}
public static void main(String[] args) {
	int []array={0,1,2,3};
	TreeNode root=makebinarytree(array, 1);
	if(root == null)  
        return;  
  
    ArrayList<TreeNode> arr=new ArrayList<>(); 
    arr.add(root);
    int cur = 0;  
    int last = 1;  
  
    while(cur < arr.size()) {  
        last = arr.size();  
  
        while(cur < last) {  
            System.out.println(arr.get(cur).val);;  
  
            if(arr.get(cur).left!= null)  
                arr.add(arr.get(cur).left);  
            if(arr.get(cur).right != null)  
                arr.add(arr.get(cur).right);  
  
            ++cur;  
        }  
  
         
}}}

