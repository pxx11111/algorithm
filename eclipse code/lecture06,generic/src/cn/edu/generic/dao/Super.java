package cn.edu.generic.dao;

import java.lang.reflect.ParameterizedType;

public class Super<T> {
	
	private Class clazz = null;
	
	public Super(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // ��ȡ��ǰnew�Ķ���� ���͵ĸ��� ����
		this.clazz = (Class) pt.getActualTypeArguments()[0]; // ��ȡ��һ�����Ͳ�������ʵ����
		System.out.println("clazz ---> " + clazz);
	}
	
	
	public void save(T t){
		System.out.println(t + "is persisted");
	}

}
