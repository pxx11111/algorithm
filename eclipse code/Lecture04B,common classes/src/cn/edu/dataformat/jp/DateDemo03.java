package cn.edu.dataformat.jp;
import java.text.DateFormat ;
import java.util.Date ;
public class DateDemo03{
	public static void main(String args[]){
	          DateFormat df1 = null ;		                      // ����һ��DateFormat
	          DateFormat df2 = null ;		                      // ����һ��DateFormat
	          df1 = DateFormat.getDateInstance() ;	                      // �õ����ڵ�DateFormat����
	          df2 = DateFormat.getDateTimeInstance() ;	   // �õ�����ʱ���DateFormat����
	          System.out.println("new Date():"+ new Date());
	          System.out.println("DATE��" + df1.format(new Date())) ; // �������ڸ�ʽ��
	          System.out.println("DATETIME��" + df2.format(new Date())) ; // ��������ʱ���ʽ��

	}
};
