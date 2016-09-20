package cn.edu.io.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableObject {

	public static void main(String[] args) {
		Student zhang = new Student("zhangsan",85);
		
		try {
			FileOutputStream file_out = new FileOutputStream("stu.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(file_out);
			objectOut.writeObject(zhang);
			objectOut.flush();
			FileInputStream file_in = new FileInputStream("stu.txt");
			ObjectInputStream objectIn = new ObjectInputStream(file_in);
			Student li = (Student) objectIn.readObject();
			System.out.printf("\n–’√˚£∫%s£¨ÃÂ÷ÿ£∫%f",li.getName(),li.getWeight());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
