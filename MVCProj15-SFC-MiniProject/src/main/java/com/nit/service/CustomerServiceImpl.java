package com.nit.service;

import java.util.List;

import com.nit.dao.CustomerDAO;
/**
 * This class for performing business operations on customer items booking
 * 
 * @author I LOVE MY FAMILY
 *
 */

public class CustomerServiceImpl implements CustomerService {
private CustomerDAO dao;


	public CustomerServiceImpl(CustomerDAO dao) {
	this.dao = dao;
    }


	@Override
	public List<String> getBookItems() {
		// TODO Auto-generated method stub
		List<String> bookList=dao.getBookItems();
		return bookList;
	}
	
	public List<String> getGenders() {
		// TODO Auto-generated method stub
		List<String> gendersList=dao.getGender();
		return gendersList;
	}



	public List<String> getCountries() {
		// TODO Auto-generated method stub
		List<String> countriesList=dao.getCountries();
		return countriesList;
	}


	@Override
	public List<String> getDeliverList() {
		// TODO Auto-generated method stub
		List<String> deliverList=dao.getdeliverList();
		return deliverList;
	}


}
