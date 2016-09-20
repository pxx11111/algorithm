package cn.lab.connection;

import java.sql.Connection;

public interface ConnectionInter {
     public Connection getConnection();
     public void closeConnection();
}
