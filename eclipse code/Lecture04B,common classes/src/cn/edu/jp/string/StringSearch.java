package cn.edu.jp.string;

import javax.swing.JOptionPane;

public class StringSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = JOptionPane.showInputDialog(null, "Please input a string:");
		String searchString = JOptionPane.showInputDialog(null, "Please input s seachString:");
	    String text = "String:\"" + string +"\",length:" + string.length()
	    		+ "\nsearchString:\"" + searchString + "\",length:" + searchString.length()
	    		+ "\n\nString seach results:\n";
	    text+="string.indexOf(searchString):" + string.indexOf(searchString) + "\n";
	    text+="string.lastIndexOf(seachString):" + string.lastIndexOf(searchString) + "\n";
	    
	    //Displays the search results in a dialog box.
	    JOptionPane.showMessageDialog(null, text);
	    
	}

}
