package cn.lab.service.impl;

import java.util.Date;

import cn.lab.dao.impl.UserDaoImpl;
import cn.lab.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	
	@Override
	public void register(int id, String username, int password, String birthday,
			float money) {
		int data = new UserDaoImpl().insertUser(id,username, password, birthday,
				money);

		if (data > 0) {
			System.out.println("×¢²á³É¹¦£¡");
		} else {
			System.out.println("×¢²áÊ§°Ü£¡");
		}
		
	}

}
