package com.pxx;

public class Fifo {
	/**
	 * 先进先出转换算法
	 * @author Administrator
	 *
	 */
	
		/**
		 * 内存块的个数
		 */
		public static final int N = 3;
		/**
		 * 内存块数组
		 */
		Object[] array = new Object[N];
		private int size;
		/**
		 * 内存是非空为否
		 * @return
		 */
		public boolean isEmpty() {
			if(0 == size)
				return true;
			else
				return false;
		}
		
		/**
		 * 内存是非空满
		 * @return
		 */public boolean isFulled() {
			if(size >= N) 
				return true;
			else 
				return false;
		}
		/**
		 * 元素(页框)的个数
		 * @return
		 */
		public int size() {
			return size;
		}
		/**
		 * 查找元素o在数组中的位置
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
		 * 页面转换
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
		 * 输出内存区中的各数据
		 */
		public void showMemoryBlock() {
			for(int i=0; i<size; i++) {
				System.out.print(array[i] + "        ");
			}
		}
		
		/**
		 * 清空队列(页框)
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


