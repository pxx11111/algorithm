package cn.edu.io.seri;

import java.io.Serializable;
   
public class Student implements Serializable{
    String name = null;
    double weight;
	public Student(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
    
    
}
