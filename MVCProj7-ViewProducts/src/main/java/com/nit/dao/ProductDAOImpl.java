package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nit.bo.ProductBO;

public class ProductDAOImpl implements ProductDAO {
	private static final String INSERT_PRODUCTS_QUERY="SELECT PID,PNAME,PRICE,STOCKQTY,MFGDATE,EXYDATE FROM PRODUCT ORDER BY PRICE";
	
	private JdbcTemplate jt;
	
	

	public ProductDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}



	@Override
	public List<ProductBO> getAllProducts() {
		// TODO Auto-generated method stub
		List<ProductBO> listBO=jt.query(INSERT_PRODUCTS_QUERY, new ProductResultSetExtrator());
		return listBO;
	}
	
	private class ProductResultSetExtrator implements ResultSetExtractor<List<ProductBO>>{

		@Override
		public List<ProductBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			List<ProductBO> listBO=new ArrayList();
			while(rs.next()) {
				ProductBO bo=new ProductBO();
				bo.setPid(rs.getInt(1));
				bo.setPname(rs.getString(2));
				bo.setPrice(rs.getFloat(3));
				bo.setStockQty(rs.getFloat(4));
				bo.setMfgDate(rs.getDate(5));
				bo.setExpDate(rs.getDate(6));
				listBO.add(bo);
			}
			return listBO;
		}
		
	}

}
