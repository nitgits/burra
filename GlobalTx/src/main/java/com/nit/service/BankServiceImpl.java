package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.DepositeDAO;
import com.nit.dao.WithdrawDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private DepositeDAO depDao;
	@Autowired
	private WithdrawDAO withDao;

	@Override
	public int withdraw(int acc, float amt) {
		// TODO Auto-generated method stub
		//System.out.println(acc+"   "+amt);
		int count = withDao.withdraw(acc, amt);
		return count;
	}

	@Override
	public int deposit(int acc, float amt) {
		// TODO Auto-generated method stub
		//System.out.println("deposit:: "+acc+"   "+amt);
		int count = depDao.deposit(acc, amt);
		return count;
	}

	public int getData() {
		int count = depDao.getData();
		return count;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Boolean transferMoney(int srcAcc, int destAcc, float amt) {
		// TODO Auto-generated method stub
		int withCount = withdraw(srcAcc, amt);
		int depCount = deposit(destAcc, amt);
		if (withCount == 0 || depCount == 0) {
			throw new RuntimeException();
		}
		return true;
	}

}
