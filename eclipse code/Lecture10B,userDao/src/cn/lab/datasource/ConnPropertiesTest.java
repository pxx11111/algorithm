package cn.lab.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnPropertiesTest {
	static Connection conn = null;
	static Statement st = null;
	static ResultSet rs = null;
    public static void main(String args[]){
    	PropertiesConfig  propertiesConfig = new PropertiesConfig();
    	String driver = propertiesConfig.getPropertiesValue("driverClassName");
    	String url = propertiesConfig.getPropertiesValue("url");    	
    	String user = propertiesConfig.getPropertiesValue("username");
    	String pass = propertiesConfig.getPropertiesValue("password");
    	
    	try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,user,pass);
			
			st = conn.createStatement();
			st.executeUpdate("insert into user1 values(9,'уе╥и',123,0126-03-09,2400)");
			rs = st.executeQuery("select * from user1");
			while(rs.next()){
				System.out.println(rs.getObject(1) + "," + rs.getObject(2) + "," + rs.getObject(3) + ".");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
