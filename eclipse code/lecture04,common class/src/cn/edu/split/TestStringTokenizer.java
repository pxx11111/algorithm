package cn.edu.split;
import java.util.*;
public class TestStringTokenizer {
   public static void main(String args[]) {
      String s="we are stud,ents";
      StringTokenizer fenxi=new StringTokenizer(s," ,"); 
      int number=fenxi.countTokens();
      while(fenxi.hasMoreTokens()) {
          String str=fenxi.nextToken();
          System.out.println(str);
          System.out.println("还剩"+fenxi.countTokens()+"个单词");
      }
      System.out.println("s共有单词："+number+"个");
    } 
}