package com.pxx;

public class Fifo {
	/**
	 * �Ƚ��ȳ�ת���㷨
	 * @author Administrator
	 *
	 */
	
		/**
		 * �ڴ��ĸ���
		 */
		public static final int N = 3;
		/**
		 * �ڴ������
		 */
		Object[] array = new Object[N];
		private int size;
		/**
		 * �ڴ��Ƿǿ�Ϊ��
		 * @return
		 */
		public boolean isEmpty() {
			if(0 == size)
				return true;
			else
				return false;
		}
		
		/**
		 * �ڴ��Ƿǿ���
		 * @return
		 */public boolean isFulled() {
			if(size >= N) 
				return true;
			else 
				return false;
		}
		/**
		 * Ԫ��(ҳ��)�ĸ���
		 * @return
		 */
		public int size() {
			return size;
		}
		/**
		 * ����Ԫ��o�������е�λ��
		 * @param o
		 * @return
		 */
		public int indexOfElement(Object o) {
			for(int i=0; i<N; i++) { 
				if(o == array[i]) {
					return i;
				}
			}
			return -1;
		}	
		/*public void push(Object o) {
			Node p = new Node(o);
			//Node p2 = head;
			p.next = head;	
			head = p;
		}*/
		/**
		 * ҳ��ת��
		 * @param obj
		 */
		public Object trans(Object obj){
			Object e = null;
			int t = 0;
			if(indexOfElement(obj) != -1) {
				//t = indexOfElement(obj);
				//for(int i=t; i<size-1; i++) {
					//array[i] = array[i+1];
				//}
				//array[size-1] = obj;
			} else {
				if(!isFulled()){
					array[size] = obj;
					size ++;
				} else {
					for(int i=0; i<size-1; i++) {
						array[i] = array[i+1];
					}
					array[size-1] = obj;
				}
			}
			if( -1 == t) {
				return null;
			} else {
				return array[t];
			}
		}
		/**
		 * ����ڴ����еĸ�����
		 */
		public void showMemoryBlock() {
			for(int i=0; i<size; i++) {
				System.out.print(array[i] + "        ");
			}
		}
		
		/**
		 * ��ն���(ҳ��)
		 */
		public void clear(){
			
		}
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Integer iter[] = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1};
			Fifo fifo = new Fifo();
			for(int i=0; i<iter.length; i++) {
				fifo.trans(iter[i]);
				fifo.showMemoryBlock();
				System.out.println();
			}
		}

	}


