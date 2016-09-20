package cn.edu.io.randomaccess;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		Employee employee1 = new Employee(5,"张三");
		Employee employee2 = new Employee(6,"李四");
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
		raf2.skipBytes(Employee.LEN*2+4);//跳过第一个员工
		String strName2 = "";
		for(int i=0;i<Employee.LEN;i++){
			//一次一个字符的读取员工姓名
			strName2 = strName2 + raf2.readChar();
		}
		int age2 = raf2.readInt();
		//读取第二个员工姓名信息，并截取用于信息
		System.out.println("strName2=" + strName2.substring(0, strName2.indexOf('$')));
		System.out.println("work_age=" + age2);
		//跳转回第一个员工信息
		raf2.seek(0);
		String strName1 = "";
		for(int i=0;i<Employee.LEN;i++){
			//一次一个字符的读取员工姓名
			strName1 = strName1 + raf2.readChar();
		}
		int age1 = raf2.readInt();
		//读取第一个员工姓名信息，并截取用于信息
		System.out.println("strName1=" + strName1.substring(0, strName1.indexOf('$')));
		System.out.println("work_age=" + age1);
		//读取第三个员工姓名信息
		raf2.skipBytes(Employee.LEN*2+4);
		String strName3 = "";
		for(int i=0;i<Employee.LEN;i++){
			//一次一个字符的读取员工姓名
			strName3 = strName3 + raf2.readChar();
		}
		int age3 = raf2.readInt();
		//读取第二个员工姓名信息，并截取用于信息
		System.out.println("strName3=" + strName3.substring(0, strName3.indexOf('$')));
		System.out.println("work_age=" + age3);
	}
}
