package cn.edu.io.randomaccess;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		Employee employee1 = new Employee(5,"����");
		Employee employee2 = new Employee(6,"����");
		Employee employee3 = new Employee(7,"James");
		
		File file = new File("employee.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
		randomAccessFile.writeChars(employee1.getName());
		randomAccessFile.writeInt(employee1.getWork_age());
		randomAccessFile.writeChars(employee2.getName());
		randomAccessFile.writeInt(employee2.getWork_age());
		randomAccessFile.writeChars(employee3.getName());
		randomAccessFile.writeInt(employee3.getWork_age());
		randomAccessFile.close();
		
		RandomAccessFile raf2 = new RandomAccessFile(file, "r");
		raf2.skipBytes(Employee.LEN*2+4);//������һ��Ա��
		String strName2 = "";
		for(int i=0;i<Employee.LEN;i++){
			//һ��һ���ַ��Ķ�ȡԱ������
			strName2 = strName2 + raf2.readChar();
		}
		int age2 = raf2.readInt();
		//��ȡ�ڶ���Ա��������Ϣ������ȡ������Ϣ
		System.out.println("strName2=" + strName2.substring(0, strName2.indexOf('$')));
		System.out.println("work_age=" + age2);
		//��ת�ص�һ��Ա����Ϣ
		raf2.seek(0);
		String strName1 = "";
		for(int i=0;i<Employee.LEN;i++){
			//һ��һ���ַ��Ķ�ȡԱ������
			strName1 = strName1 + raf2.readChar();
		}
		int age1 = raf2.readInt();
		//��ȡ��һ��Ա��������Ϣ������ȡ������Ϣ
		System.out.println("strName1=" + strName1.substring(0, strName1.indexOf('$')));
		System.out.println("work_age=" + age1);
		//��ȡ������Ա��������Ϣ
		raf2.skipBytes(Employee.LEN*2+4);
		String strName3 = "";
		for(int i=0;i<Employee.LEN;i++){
			//һ��һ���ַ��Ķ�ȡԱ������
			strName3 = strName3 + raf2.readChar();
		}
		int age3 = raf2.readInt();
		//��ȡ�ڶ���Ա��������Ϣ������ȡ������Ϣ
		System.out.println("strName3=" + strName3.substring(0, strName3.indexOf('$')));
		System.out.println("work_age=" + age3);
	}
}
