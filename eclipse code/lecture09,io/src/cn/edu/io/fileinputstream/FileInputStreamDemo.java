package cn.edu.io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		int size;
		/**
		 * ----����·��
			*ע�⣺���·������ʼ����б��"/";
			���磺filepath="resource/train.txt";
			������filepath="/resource/train.txt"; //error!
			����˵���� ·����ƴ�� �����Ҫ��ȡ�ļ��ľ���·��
			----���·��
			ʹ��java project������ʹ��java.io�����·����ȡ�ļ������ӣ�
			 *Ŀ¼�ṹ��
			  DecisionTree
			            |___src
			                 |___com.decisiontree.SamplesReader.java
			            |___resource
			                 |___train.txt,test.txt
			 *SamplesReader.java:
			  String filepath="resource/train.txt";//ע��filepath�����ݣ�
			  File file=new File(filepath);
			  ����
			 
		 */
		FileInputStream f = new FileInputStream("src/cn/edu/io/fileinputstream/FileInputStreamDemo.java");
		//FileInputStream f = new FileInputStream("FileDemo.java");
		System.out.println("�ļ���С��" + (size =f.available())+ "�ֽڡ�");
		int n = size/3;
		System.out.println("��һҳ��һ���Զ�ȡ" + n +"���ֽڡ�");
		for(int i=0;i<n;i++){
			System.out.print((char)f.read());
		}
		System.out.println("δ��ȡ�ֽ���" + f.available());
		System.out.println("�ٴζ�ȡ" + n + "���ֽڣ��浽�ֽ�������");
		byte[] b = new byte[n];
		if(f.read(b)!=n){
			System.err.println("��ȡ" + n + "���ֽ�ʧ��");
		}
		System.out.println(new String(b,0,n));
		System.out.println("����δ��ȡ���ֽ�����"+ (size = f.available()) + "���ֽڡ�");
		System.out.println("��δ��ȡ���ֽ����У����ļ�ָ������һ�㣬ֻ��ȡ���һ�롣");
		System.out.println("����δ��ȡ���ֽ�����"+  f.available() + "���ֽڡ�");
		f.skip(size/2);
		if(f.read(b,n/2,n/2)!=n/2){
			System.err.println("��ȡ" + n/2 + "���ֽ�ʧ��");
		}
		System.out.println(new String(b,0,b.length));
		System.out.println("����δ��ȡ���ֽ�����"+  f.available() + "���ֽڡ�");
		f.close();
	}
}
