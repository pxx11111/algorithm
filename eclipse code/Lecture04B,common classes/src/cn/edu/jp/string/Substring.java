package cn.edu.jp.string;

import javax.swing.JOptionPane;

public class Substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = JOptionPane.showInputDialog(null,"Please enter a string:");
		int startIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter start:"));
		int endIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter end:"));
		
		String text = "string:\"" + string + "\",length:" + string.length()
				      + "\nstartIndex:" + startIndex + ",endIndex:" + endIndex
				      + "\n\nSubstrings:\n";
		text+="string.substring(startIndex):" + string.substring(startIndex) + "\n";
		text+="string.substring(startIndex,endIndex):" + string.substring(startIndex, endIndex) + "\n";
		
		//Displays the substring in a dialog box.
		System.out.println(text);

	}

}
