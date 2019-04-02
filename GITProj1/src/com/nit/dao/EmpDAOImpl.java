package com.nit.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nit.util.JdbcUtil;

public class EmpDAOImpl implements EmpDAO {

	@Override
	public String getEmp() throws SQLException {
		// TODO Auto-generated method stub
		Connection util=null;
		util=JdbcUtil.getConnection("oracle:thin:@localhost:1521:xe", "system", "system");
		return "Connection established";
	}
	
	
	public String hello() {
		return "Helo from dev";
	}

}
