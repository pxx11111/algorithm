package com.p20160827;

public class ZiFUCHuanYaSuo {
public static void main(String[] args) {
	String str="rrrrrw";
	Zipper zip=new Zipper();
     String str1=zip.zipString(str);
     System.out.println(str1);
}
}

class Zipper {
    public String zipString(String iniString) {
        // write code here
        if(iniString==null||iniString.trim().length()==0){
            return "";
        }
        StringBuilder strB = new StringBuilder("");
        char[] iniStr = iniString.toCharArray();
        char pre;
        pre = iniStr[0];
        int count = 1;
        for(int i = 1;i < iniStr.length; i++){
            if(pre == iniStr[i]){
                count++;
            }else{
                strB.append(pre+""+count);
                pre = iniStr[i];
                count = 1;
            }
        }
        strB.append(pre+""+count);
        if(strB.toString().length() >= iniString.length()){
            return iniString;
        }
        return strB.toString();
    }
}