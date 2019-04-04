package com.nit.service;

import com.nit.bo.CustomerBO;
import com.nit.dao.CustomerDAO;
import com.nit.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	
	

	public CustomerServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}



	@Override
	public String register(CustomerDTO dto) {
		// TODO Auto-generated method stub
		CustomerBO bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setMobileno(dto.getMobileno());
		bo.setBillamt(dto.getBillamt());
		int res=dao.insert(bo);
		if(res==0) {
			return "Registration Failed";
		}
		return "Registration Succeded";
	}

}
