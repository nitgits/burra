package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
/**
 * This class is for customer booking details
 * 
 * @author I LOVE MY FAMILY
 *
 */
public class CustomerDAOImpl implements CustomerDAO {
	private static final String GET_BOOK_ITEMS="SELECT ITEMS FROM BOOKITEMS";
	private static final String GET_DELIVER_TYPE="SELECT DELIVER FROM BOOKITEMS";
	private static final String GET_GENDER="SELECT GENDER FROM REGISTRATION";
	private static final String GET_COUNTRIES="SELECT COUNTRIES FROM REGISTRATION";
	
	private JdbcTemplate jt;
	
	public CustomerDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

/**
 * This is for getting the book items from bookitems table
 * 
 * @return list
 * @param
 */
    @Override
	public List<String> getBookItems() {
		// TODO Auto-generated method stub
		List<String> itemsList=jt.query(GET_BOOK_ITEMS, new ResultSetExtractor<List<String>>() {

			@Override
			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<String> itemsList=null;
				//creating list obj
				itemsList=new ArrayList();
				//copy from rs to list
				/*while(rs.next()) {
					if(rs.getString(1)!=null) {
					System.out.println("1........"+rs.getString(1));
					itemsList.add(rs.getString(1));
					}
					
				}*/
				
				itemsList.add("asd");
				itemsList.add("asdl");
				return itemsList;
			}
		});
		return itemsList;
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
	public List<String> getdeliverList() {
		List<String> deliverList=jt.query(GET_DELIVER_TYPE, new ResultSetExtractor<List<String>>() {

			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<String> deliverList=null;
				deliverList=new ArrayList();
				while(rs.next()) {
					if(rs.getString(1)!=null) {
						deliverList.add(rs.getString(1));
					}
				}
				return deliverList;
			}
			
		}); 
		return deliverList;
	}


}
