package cn.edu.jp.regexp.textbook;

import java.util.Scanner;
public class Example8_9 {
   public static void main (String args[ ]) {
      String regex = "[a-zA-Z]+";
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      if(str.matches(regex)) {
          System.out.println(str+"�е��ַ�����Ӣ����ĸ");
      }else{
    	  System.out.println(str + "�д��ڷ�Ӣ����ĸ");
      }
   }
}