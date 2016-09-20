package cn.edu.io.copyfile;

import java.io.*;

public class CopyFile {
	public static void main(String args[]) throws IOException {
		String fname = "w.txt";
		String childdir = "b";
		new CopyFile().copyfile(fname, childdir);
	}

	public void copyfile(String fname, String childdir) throws IOException {
		File f1, f2, child;
		f1 = new File(fname);
		child = new File(childdir);
		if (f1.exists()) {
			if (!child.exists())
				child.mkdir();
			f2 = new File(child, fname);
			if (!f2.exists() || f2.exists()
					&& (f1.lastModified() > f2.lastModified()))
				copy(f1, f2);
		} else
			System.out.println(" file not found!");
	}

	public void copy(File f1, File f2) throws IOException {
		FileInputStream rf = new FileInputStream(f1);
		FileOutputStream wf = new FileOutputStream(f2);
		int count, n = 512;
		byte buffer[] = new byte[n];
		count = rf.read(buffer, 0, n);
		while (count != -1) {
			wf.write(buffer, 0, count);
			count = rf.read(buffer, 0, n);
		}
		System.out.println("Copy File" + f2.getName());
		rf.close();
		wf.close();
	}
}
