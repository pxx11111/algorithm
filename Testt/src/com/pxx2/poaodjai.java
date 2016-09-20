package com.pxx2;



public class  poaodjai  {
	/**
	 * 根据前序和中序，得到后序
	 * @param preOrder
	 * @param midOrder
	 * @return
	 */
	public static String getPostByPreAndMid(String[] preOrder, String[] midOrder) throws NullPointerException, IllegalArgumentException{
		if(preOrder==null || midOrder==null) throw new NullPointerException("传递的数组不能为null！");
		if(preOrder.length != midOrder.length) throw new IllegalArgumentException("前序数组和中序数组的长度不一致！");
		
		if(preOrder.length==0) return "";
		if(preOrder.length == 1) return preOrder[0];
		
		String postOrder = "";
		String root = preOrder[0];//get root
		int index = indexOf(midOrder, root);
		if(index==-1) throw new IllegalArgumentException("传递的参数不对");
		String[] leftPreOrder = new String[index];
		System.arraycopy(preOrder, 1, leftPreOrder, 0, index);
		String[] leftMidOrder = new String[index];
		System.arraycopy(midOrder, 0, leftMidOrder, 0, index);
		String leftPostOrder = getPostByPreAndMid(leftPreOrder, leftMidOrder);
		
		int rightPartLen = preOrder.length-index-1;
		String[] rightPreOrder = new String[rightPartLen];
		System.arraycopy(preOrder, index+1, rightPreOrder, 0, rightPartLen);
		String[] rightMidOrder = new String[rightPartLen];
		System.arraycopy(midOrder, index+1, rightMidOrder, 0, rightPartLen);
		String rightPostOrder = getPostByPreAndMid(rightPreOrder, rightMidOrder);

		if(leftPostOrder != null && !leftPostOrder.equals("")){
			if(leftPostOrder.endsWith(",")){//判断的目的是为了输出的时候，每个元素以","隔开
				postOrder += leftPostOrder;
			}else{
				postOrder += leftPostOrder + ",";
			}
		}
		if(rightPostOrder != null && !rightPostOrder.equals("")){
			if(rightPostOrder.endsWith(",")){
				postOrder += rightPostOrder;
			}else{
				postOrder += rightPostOrder + ",";
			}
		}
		postOrder += root;
		return postOrder;
	}
	
	/**
	 * 获得元素在数组的索引
	 * @param strArr
	 * @param key
	 * @return
	 */
	private static int indexOf(String[] strArr, String key){
		int index = -1;
		for(int i=0; i<strArr.length; i++){
			if(strArr[i].equals(key)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		String[] preOrder = new String[]{"a", "b", "d", "g", "c", "e", "f", "h"};
		String[] midOrder = new String[]{"d", "g", "b", "a", "e", "c", "h", "f"};
		String postOrder = getPostByPreAndMid(preOrder, midOrder);
		System.out.println(postOrder);
	}
}