package cn.edu.dataformat.jp;

import java.text.DateFormat ;
import java.util.Date ;
import java.util.Locale ;
public class DateDemo04{
   public static void main(String args[]){
		DateFormat df1 = null ;		// ����һ��DateFormat
		DateFormat df2 = null ;		// ����һ��DateFormat
		// �õ����ڵ�DateFormat����
		df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN")) ;		
		df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new Locale("zh","CN")) ;	// �õ�����ʱ���DateFormat����
		System.out.println("DATE��" + df1.format(new Date())) ; // �������ڸ�ʽ��
		System.out.println("DATETIME��" + df2.format(new Date())) ;	 // ��������ʱ���ʽ��
	}
}
