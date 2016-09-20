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
			System.out.println("文件夹 " + dirname + " 的内容如下：");
			String[] s = f1.list(only);
			for(int i = 0;i<s.length;i++){
				File f = new File(dirname + "/" +s[i]);
				if(f.isDirectory()){
					System.out.println( s[i] + "是文件夹");
				}else{
					System.out.println(s[i] + "是文件");
					printLine("文件名:" + f.getName());
					printLine("相对路径:" + f.getPath());
					printLine("绝对路径:" + f.getAbsolutePath());
					printLine("上级目录:" + f.getParent());
					printLine(f.exists()?"存在":"不存在");
					printLine(f.canWrite()?"可写":"不可写");
					printLine(f.canRead()?"可读":"不可读");
					printLine(f.isDirectory()?"是":"不是" + "文件夹");
					printLine(f.isFile()?"是":"不是" + "文件");
					printLine(f.isAbsolute()?"是绝对路径":"不是绝对路径");
					printLine("最后被修改时间" + f.lastModified());
					printLine("文件大小:" + f.length());
					
				}
			}
		}else{
			System.out.println(dirname + "不是一个文件夹");
		}

	}

	private static void printLine(String string) {
		System.out.println(string);
	}

}
