package cn.edu.io.fileoutputstream;
import java.io.*;
public class FileOutputStreamExample02{ 
    public static void main(String[] args) {
       try {                 
            String str ="好好学习Java";
            byte[] words  = str.getBytes();
            OutputStream fos = new FileOutputStream("Output.txt ");
            fos.write(words, 0, words.length);
            System.out.println("Text文件已更新!");
            fos.close();
       } catch (IOException obj) {
                 System.out.println("创建文件时出错!");
       }
} }
