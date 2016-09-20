package cn.lab.dao;

import java.util.Date;

public interface UserDao {
    public int insertUser(int id,String username, int password,String birthday,float money) ;
	public void deleteUser(String username);
	public void findUser(String username);
	public void updateUserPassword(String username,int password);
}
