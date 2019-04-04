package com.nit.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("depDao")
public class DepositeDAOImpl implements DepositeDAO {
	private static final String DEPOSIT_QUERY="UPDATE DE_ACCOUNT SET AMOUNT=AMOUNT+? WHERE ACCOUNT=?";
 private static final String SELECT_QUERY="SELECT COUNT(*) FROM DE_ACCOUNT";

	@Autowired
	@Qualifier("template1")
	  private JdbcTemplate oraJt;
	
	@Override
	public int deposit(int acc, float amt) {
		// TODO Auto-generated method stub
		//System.out.println("deposit  "+acc+"   "+amt);
		int count=oraJt.update(DEPOSIT_QUERY,amt,acc);
return count;
	}

	public int getData() {
		int count=oraJt.update(SELECT_QUERY);
		return count;
	}


}
