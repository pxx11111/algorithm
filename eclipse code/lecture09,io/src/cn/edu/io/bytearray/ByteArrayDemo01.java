package cn.edu.io.bytearray;
import java.io.* ;
public class ByteArrayDemo01{
	public static void main(String args[]){
		String str = "HELLOWORLD" ;	// ����һ���ַ�����ȫ���ɴ�д��ĸ���
		ByteArrayInputStream bis = null ;	// �ڴ�������
		ByteArrayOutputStream bos = null ;	// �ڴ������
		bis = new ByteArrayInputStream(str.getBytes()) ;// ���ڴ����������
		bos = new ByteArrayOutputStream() ;// ׼�����ڴ�ByteArrayInputStream�ж�ȡ����
		int temp = 0 ;
		while((temp=bis.read())!=-1){
			char c = (char) temp ;	// ��ȡ�����ֱ�Ϊ�ַ�
			bos.write(Character.toLowerCase(c)) ;// ���ַ���ΪСд
		}
		// ���е����ݾ�ȫ������ByteArrayOutputStream��
		String newStr = bos.toString() ;	// ȡ������
		try{
			bis.close() ;
			bos.close() ;
		}catch(IOException e){
			e.printStackTrace() ;
		}
		System.out.println(newStr) ;
	}
};