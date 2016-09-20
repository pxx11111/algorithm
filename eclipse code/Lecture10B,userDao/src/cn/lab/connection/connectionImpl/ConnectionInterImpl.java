package cn.lab.connection.connectionImpl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import cn.lab.connection.ConnectionInter;
import cn.lab.datasource.PropertiesConfig;

public class ConnectionInterImpl implements ConnectionInter{
    
	private Connection conn = null;
	private BasicDataSource basicDataSource = null;
	private static ConnectionInterImpl  instance = new ConnectionInterImpl();
			
	
	public static ConnectionInterImpl getInstance() {
		return instance;
	}

	public static void setInstance(ConnectionInterImpl instance) {
		ConnectionInterImpl.instance = instance;
	}

	public ConnectionInterImpl() {
		PropertiesConfig propertiesConfig = new PropertiesConfig();
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(propertiesConfig.getPropertiesValue("driverClassName"));
		basicDataSource.setUrl(propertiesConfig.getPropertiesValue("url"));
		basicDataSource.setUsername(propertiesConfig.getPropertiesValue("username"));
		basicDataSource.setPassword(propertiesConfig.getPropertiesValue("password"));
		
	}

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			conn = basicDataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

	@Override
	public void closeConnection() {
		if(null == conn)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void closeDataSource(){
		if(null ==basicDataSource){
			try {
				basicDataSource.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    
}
