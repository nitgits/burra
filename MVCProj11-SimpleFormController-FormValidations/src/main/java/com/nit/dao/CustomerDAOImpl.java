package com.nit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nit.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO{
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO CUSTOMERINFO VALUES(CNO_SQL.NEXTVAL,?,?,?,?)"; 
private JdbcTemplate jt;


	public CustomerDAOImpl(JdbcTemplate jt) {
	this.jt = jt;
}


	@Override
	public int insert(CustomerBO bo) {
		// TODO Auto-generated method stub
		int count=0;
		count=jt.update(INSERT_CUSTOMER_QUERY,bo.getCname(),bo.getCadd(),bo.getMobileno(),bo.getBillamt());
		return count;
	}

}
