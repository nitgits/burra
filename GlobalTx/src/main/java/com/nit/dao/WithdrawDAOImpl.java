package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("withDao")
public class WithdrawDAOImpl implements WithdrawDAO {
  private static final String WITHDRAW_QUERY="UPDATE WD_ACCOUNT SET AMOUNT=AMOUNT-? WHERE ACCOUNT=?";

  @Autowired
  @Qualifier("template2")
private JdbcTemplate mySqlJt;


	@Override
	public int withdraw(int acc, float amt) {
		// TODO Auto-generated method stub
		//System.out.println("withdraw "+acc+"   "+amt);
		int depCnt=mySqlJt.update(WITHDRAW_QUERY,amt,acc);
		return depCnt;
	}

}
