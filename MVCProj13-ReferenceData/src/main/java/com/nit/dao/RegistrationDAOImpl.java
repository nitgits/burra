package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nit.bo.RegBO;

public class RegistrationDAOImpl implements RegistrationDAO {
	private static final String GET_COURSES="SELECT COURSES FROM REGISTRATION";
	private static final String GET_HOBBIES="SELECT HOBBIES FROM REGISTRATION";
	private static final String GET_GENDER="SELECT GENDER FROM REGISTRATION";
	private static final String GET_COUNTRIES="SELECT COUNTRIES FROM REGISTRATION";
	private static final String REGISTER_CUSTOMER="INSERT INTO REGISTER VALUES(?,?,?,?,?,?)";
	
	private JdbcTemplate jt;
	
	

	public RegistrationDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}



	public List<String> getCourses() {
		// TODO Auto-generated method stub
		List<String> courcesList=jt.query(GET_COURSES, new ResultSetExtractor<List<String>>() {

			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<String> courcesList=null;
				courcesList=new ArrayList();
						while(rs.next()) {
							if(rs.getString(1)!=null) {
							courcesList.add(rs.getString(1));
						}
						}
				
				return courcesList;
			}
			
		});
		return courcesList;
	}



	public List<String> getHobbies() {
		// TODO Auto-generated method stub
		List<String> hobbiesList=jt.query(GET_HOBBIES, new ResultSetExtractor<List<String>>() {

			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<String> hobbiesList=null;
				hobbiesList=new ArrayList();
				while(rs.next()) {
					if(rs.getString(1)!=null) {
					hobbiesList.add(rs.getString(1));
					}
				}
				return hobbiesList;
			}
			
		});
		return hobbiesList;
	}



	public List<String> getGender() {
		// TODO Auto-generated method stub
		List<String> genderList=jt.query(GET_GENDER, new ResultSetExtractor<List<String>>() {

			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<String> genderList=null;
				genderList=new ArrayList();
				// TODO Auto-generated method stub
				while(rs.next()) {
						if(rs.getString(1)!=null) {
						genderList.add(rs.getString(1));
					}
				}
				return genderList;
			}
			
		});
		return genderList;
	}



	public List<String> getCountries() {
		// TODO Auto-generated method stub
		List<String> countriesList=jt.query(GET_COUNTRIES, new ResultSetExtractor<List<String>>() {

			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<String> countriesList=null;
				countriesList=new ArrayList();
				while(rs.next()) {
					if(rs.getString(1)!=null) {
						countriesList.add(rs.getString(1));
					}
				}
				return countriesList;
			}
			
		}); 
		return countriesList;
	}



	@Override
	public int register(RegBO bo) {
		// TODO Auto-generated method stub
		int count=0;
	System.out.println(Arrays.toString(bo.getHobbies()));
	System.out.println(Arrays.toString(bo.getCourses()));
		count=jt.update(REGISTER_CUSTOMER, bo.getCno(),bo.getCname(),Arrays.toString(bo.getHobbies()).toString(),bo.getCountries(),Arrays.toString(bo.getCourses()).toString(),bo.getGender());
		return count;
	}

}
