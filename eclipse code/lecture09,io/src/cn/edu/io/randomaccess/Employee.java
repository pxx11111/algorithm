package cn.edu.io.randomaccess;

public class Employee {
	public int work_age;
	public String name;
	public static final int LEN = 8;

	public Employee(int work_age, String name) {
		super();
		this.work_age = work_age;
		if(name.length()>LEN){
			name = name.substring(0,LEN);
		}else{
			while(name.length()<LEN){
				name=name+"$";
			}
		}
	    this.name = name;	
	}

	public int getWork_age() {
		return work_age;
	}

	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
