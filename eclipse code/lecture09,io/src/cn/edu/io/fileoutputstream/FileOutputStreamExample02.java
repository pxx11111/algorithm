package cn.edu.io.fileoutputstream;
import java.io.*;
public class FileOutputStreamExample02{ 
    public static void main(String[] args) {
       try {                 
            String str ="�ú�ѧϰJava";
            byte[] words  = str.getBytes();
            OutputStream fos = new FileOutputStream("Output.txt ");
            fos.write(words, 0, words.length);
            System.out.println("Text�ļ��Ѹ���!");
            fos.close();
       } catch (IOException obj) {
                 System.out.println("�����ļ�ʱ����!");
       }
} }
