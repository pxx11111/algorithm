package cn.edu.array;

public class TestOneDim {

	/**
	 * @param hl_lee
	 */
	public static void main(String[] args) {
        /**
         * 
         * 一维数组
         * 
         */
		//1.声明数组
		int[] a,b;
		
		//2.创建数组对象
		a = new int[3];
		b= new int[4];
		/**
		 * 3.数组初始化（对数组元素的初始化）
		 * 默认初始化：数组元素相当于对象的变量，
		 * 默认值与成员变量规则一样,数字：0,boolean为:false,引用类型null
		 */
		
		//动态初始化
		/*a[0] = 23;
		a[1] = 35;
		a[2] = 55;*/
		for(int i = 0;i<a.length;i++)
			a[i]=i;
		//静态初始化
		int c[] = {1,2,3,4};
		int[] d = {5,6,7};
		
		Student[] students = {
				               new Student(),
				               new Student(),
				               new Student()
				              };
		
		
		
	}

}
