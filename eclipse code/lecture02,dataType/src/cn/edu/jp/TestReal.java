package cn.edu.jp;

public class TestReal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * float��Χ��[-3.4E10^38,3.4E10^38]��Ȼ����4���ֽڣ�int����׼ȷ��ʾ���ݣ�float��Ȼ��Χ�󣬵���׼ȷ
		 * 
		 */
		double d = 6.28;  //���ֳ���Ĭ��double����
		//float f = 6.29; //�������ֺ��F����Сд���ɣ��Ƽ��ô�д������
		float f1 = 6.29F;
		/**
		 * ��ѧ������
		 */
		float f2 = 314e-2F;
		
		/**
		 * �Ƽ���Ҫʹ�ø������Ƚ�,����Ҫ����ʹ��BigDecimal
		 */
		
		float f3 = 0.1F;
		double d3 = 1.0/10;
		System.out.println(f3==d3); //false
		
		
	}

}
