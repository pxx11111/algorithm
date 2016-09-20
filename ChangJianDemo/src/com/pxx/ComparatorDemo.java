package com.pxx;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public List<Student> mList;
	public List<Comparator<Student>> mCmpList = new ArrayList<Comparator<Student>>();
	public  ComparatorDemo(List<Student> list){
		mList = list;
		mCmpList.add(compareAgeASC);
		mCmpList.add(comparePointDESC);
		sort(mList, mCmpList);
	}
	public void sort(List<Student> list, final List<Comparator<Student>> comList) {
		if (comList == null)
			return;
		Comparator<Student> cmp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				for (Comparator<Student> comparator : comList) {
					if (comparator.compare(o1, o2) > 0) {
						return 1;
					} else if (comparator.compare(o1, o2) < 0) {
						return -1;
					}
				}
				return 0;
			}
		};
		Collections.sort(list, cmp);
	}

	private Comparator<Student> compareAgeASC = new Comparator<ComparatorDemo.Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.age > o2.age ? 1 : -1;
		}
	};

	private Comparator<Student> comparePointDESC = new Comparator<ComparatorDemo.Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.point < o2.point ? 1 : -1;
		}
	};

	/**
	 * @author 80059130
	 * 
	 */
public static class Student {
		public int age;
		public String name;
		public int point;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
			this.point = point;
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Student stu=new Student();
			stu.setName("wang"+i);
			stu.setAge(10-i);
			stu.setPoint(10-i);
			list.add(stu);
		}
		ComparatorDemo cd=new ComparatorDemo(list);
		
		for (Student student : list) {
			System.out.println(student.name);
		}
	}
}

