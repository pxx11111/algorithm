package cn.lab.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.lab.connection.connectionImpl.ConnectionInterImpl;

import cn.lab.dao.UserDao;
import cn.lab.domain.User;

/**
 * 
 * 2013-06-03
 * 
 * 
 * 
 */
public  class UserDaoImpl implements UserDao {

	@Override
	public int insertUser(int id, String username, int password, String birthday,
			float money) {
		ConnectionInterImpl  connectionInterImpl = ConnectionInterImpl.getInstance();
	    Connection conn =   connectionInterImpl.getConnection();
	    PreparedStatement pst = null;
	    int data = 0;
	    
	    Date d = convertDate(birthday);

	    
	    try {
			pst = conn.prepareStatement("insert into user value(?,?,?,?,?)");
	    	//pst = conn.prepareStatement("insert into user value(8,'lisi',123,0126-03-09,2500)");
			pst.setInt(1, id);
			pst.setString(2, username);
			pst.setInt(3, password);
			pst.setDate(4,new java.sql.Date(d.getTime()));
			pst.setFloat(5, money);
			data = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			connectionInterImpl.closeConnection();
			connectionInterImpl.closeDataSource();
		}
		return data;
		
	}

	public Date convertDate(String strDate) {
		String pat1 = "yyyy-MM-dd" ;
	    // 准备第二个模板，将提取后的日期数字变为指定的格式
	    //String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒" ;
	    SimpleDateFormat sdf1 = new SimpleDateFormat(pat1) ;	// 实例化模板对象
	    //SimpleDateFormat sdf2 = new SimpleDateFormat(pat2) ;	// 实例化模板对象
	    Date d = null ;
	    try{
	          d = sdf1.parse(strDate) ;	// 将给定的字符串中的日期提取出来
	   }catch(Exception e){	// 如果提供的字符串格式有错误，则进行异常处理
	        e.printStackTrace() ;	// 打印异常信息
	   }
	    return d;
	}
	
	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserPassword(String username, int password) {
		// TODO Auto-generated method stub
		
	}



}
