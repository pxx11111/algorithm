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
          System.out.println("��ʣ"+fenxi.countTokens()+"������");
      }
      System.out.println("s���е��ʣ�"+number+"��");
    } 
}