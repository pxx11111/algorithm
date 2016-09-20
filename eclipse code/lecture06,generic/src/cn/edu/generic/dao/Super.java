package cn.edu.generic.dao;

import java.lang.reflect.ParameterizedType;

public class Super<T> {
	
	private Class clazz = null;
	
	public Super(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的 泛型的父类 类型
		this.clazz = (Class) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
		System.out.println("clazz ---> " + clazz);
	}
	
	
	public void save(T t){
		System.out.println(t + "is persisted");
	}

}
