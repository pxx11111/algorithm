package cn.edu.io.file;

import java.io.File;
import java.io.FilenameFilter;

class OnlyJava implements FilenameFilter{
    String java;
    
    public OnlyJava(String java){
    	this.java ="." + java;
    }
    
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(java);
	}
	
	
}

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dirname = "reflect";
		File f1 = new File(dirname);
		FilenameFilter only = new OnlyJava("java");
		if(f1.isDirectory()){
			System.out.println("�ļ��� " + dirname + " ���������£�");
			String[] s = f1.list(only);
			for(int i = 0;i<s.length;i++){
				File f = new File(dirname + "/" +s[i]);
				if(f.isDirectory()){
					System.out.println( s[i] + "���ļ���");
				}else{
					System.out.println(s[i] + "���ļ�");
					printLine("�ļ���:" + f.getName());
					printLine("���·��:" + f.getPath());
					printLine("����·��:" + f.getAbsolutePath());
					printLine("�ϼ�Ŀ¼:" + f.getParent());
					printLine(f.exists()?"����":"������");
					printLine(f.canWrite()?"��д":"����д");
					printLine(f.canRead()?"�ɶ�":"���ɶ�");
					printLine(f.isDirectory()?"��":"����" + "�ļ���");
					printLine(f.isFile()?"��":"����" + "�ļ�");
					printLine(f.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
					printLine("����޸�ʱ��" + f.lastModified());
					printLine("�ļ���С:" + f.length());
					
				}
			}
		}else{
			System.out.println(dirname + "����һ���ļ���");
		}

	}

	private static void printLine(String string) {
		System.out.println(string);
	}

}
