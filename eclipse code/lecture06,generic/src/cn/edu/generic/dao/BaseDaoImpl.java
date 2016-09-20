package cn.edu.generic.dao;

import java.lang.reflect.ParameterizedType;

import cn.edu.generic.domain.Role;

public class BaseDaoImpl<T> implements BaseDao<T> {

	
	private Class clazz = null;
	
	
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		// ʹ�÷��似���õ�T����ʵ����
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // ��ȡ��ǰnew�Ķ���� ���͵ĸ��� ����
		this.clazz = (Class) pt.getActualTypeArguments()[0]; // ��ȡ��һ�����Ͳ�������ʵ����
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
