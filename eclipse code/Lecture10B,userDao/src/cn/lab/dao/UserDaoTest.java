package cn.lab.dao;

import java.sql.Date;

import cn.lab.service.RegisterService;
import cn.lab.service.impl.RegisterServiceImpl;

public class UserDaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterService rs = new RegisterServiceImpl();
		rs.register(11,"н╨яс", 123,"0126-03-05",2300);
		
	}

}
