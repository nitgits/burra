package com.nit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public static Connection getConnection(String url,String user,String pwd) throws SQLException {
		Connection con=null;
		con=DriverManager.getConnection(url,user,pwd);
		return con;
	}

}
