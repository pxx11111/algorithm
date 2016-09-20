package cn.edu.generic.dao;

import cn.edu.generic.domain.Role;

public class TestSubBaseDaoImpl extends BaseDaoImpl<Role>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Role role = new Role();
		
		BaseDaoImpl<Role> test = new TestSubBaseDaoImpl();
        //dao.save(role);
	}

}
