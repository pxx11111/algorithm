package cn.edu.jp.string;

import javax.swing.JOptionPane;

public class StringToCharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = JOptionPane.showInputDialog(null, "Enter a string:");
		
		/*char[] charArray = string.toCharArray();
		for(int i=0;i<charArray.length;i++)
		   System.out.print(charArray[i]);*/
		
		
		/*int srcStart = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter srcStart:"));
		int srcEnd = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter srcEnd:"));
		char[] charDstArray= new char[10];
		string.getChars(6, 11, charDstArray, 0);
		for(int i=0;i<srcEnd-srcStart;i++)
		System.out.print(charDstArray[i]);*/
		
		/*String matchString = JOptionPane.showInputDialog(null,"Enter mathString:");
		boolean b = string.regionMatches(6, matchString, 0, 5);
		System.out.println(b);*/
		

	}

}
