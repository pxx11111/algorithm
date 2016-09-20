package cn.edu.generic.dao;

import java.lang.reflect.ParameterizedType;

import cn.edu.generic.domain.Role;

public class BaseDaoImpl<T> implements BaseDao<T> {

	
	private Class clazz = null;
	
	
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		// 使用反射技术得到T的真实类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的 泛型的父类 类型
		this.clazz = (Class) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
		System.out.println("clazz ---> " + clazz);
	}


	@Override
	public void save(T entity) {
		
	}
	
	public static void main(String[] args) {
		Role role = new Role();
		BaseDao<Role> dao = new BaseDaoImpl<Role>();
        dao.save(role);
	}
}
