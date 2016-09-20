package cn.edu.io.exe;

import java.io.File;
import java.io.IOException;

public class RunComputerExe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Runtime ce = Runtime.getRuntime();
			File file = new File("c:/windows/system32","calc.exe");
			ce.exec(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
