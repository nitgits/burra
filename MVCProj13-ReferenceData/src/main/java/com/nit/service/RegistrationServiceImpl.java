package com.nit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nit.bo.RegBO;
import com.nit.dao.RegistrationDAO;
import com.nit.dto.RegDTO;

public class RegistrationServiceImpl implements RegistrationService{
	private RegistrationDAO dao;
	
	

	public RegistrationServiceImpl(RegistrationDAO dao) {
		this.dao = dao;
	}



	public List<String> getCourses() {
		// TODO Auto-generated method stub
		List<String> courcesList=dao.getCourses();
		return courcesList;
	}



	public List<String> getHobbies() {
		// TODO Auto-generated method stub
		List<String> hobbiesList=dao.getHobbies();
		return hobbiesList;
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
	public String register(RegDTO dto) {
		// TODO Auto-generated method stub
		//copy dto to bo
		RegBO bo=null;
		bo=new RegBO();
		BeanUtils.copyProperties(dto, bo);
		String result=null;
		int count=dao.register(bo);
		if(count==0) {
			result="Registration failed";
		}
		result="Registration succeeded";
		return result;
	}

}
