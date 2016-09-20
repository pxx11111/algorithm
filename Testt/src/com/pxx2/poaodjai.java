package com.pxx2;



public class  poaodjai  {
	/**
	 * ����ǰ������򣬵õ�����
	 * @param preOrder
	 * @param midOrder
	 * @return
	 */
	public static String getPostByPreAndMid(String[] preOrder, String[] midOrder) throws NullPointerException, IllegalArgumentException{
		if(preOrder==null || midOrder==null) throw new NullPointerException("���ݵ����鲻��Ϊnull��");
		if(preOrder.length != midOrder.length) throw new IllegalArgumentException("ǰ���������������ĳ��Ȳ�һ�£�");
		
		if(preOrder.length==0) return "";
		if(preOrder.length == 1) return preOrder[0];
		
		String postOrder = "";
		String root = preOrder[0];//get root
		int index = indexOf(midOrder, root);
		if(index==-1) throw new IllegalArgumentException("���ݵĲ�������");
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
			if(leftPostOrder.endsWith(",")){//�жϵ�Ŀ����Ϊ�������ʱ��ÿ��Ԫ����","����
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
	 * ���Ԫ�������������
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