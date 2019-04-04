package com.nit.dao;

import java.util.List;

import com.nit.bo.RegBO;

public interface RegistrationDAO {
	public List<String> getCourses();
	public List<String> getHobbies();
	public List<String> getGender();
	public List<String> getCountries();
	public int register(RegBO bo);
	

}
