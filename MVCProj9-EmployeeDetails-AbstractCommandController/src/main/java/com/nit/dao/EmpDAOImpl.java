
package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nit.bo.EmpInputBO;
import com.nit.bo.EmpResultBO;

public class EmpDAOImpl implements EmpDAO {
	
	private static final String GET_EMPLOYEE_QUERY="SELECT EID,ENAME,DESG,SALARY,DEPTNO,MGR FROM EMPLOYEE WHERE (EID IS NOT NULL AND EID=?) OR (ENAME IS NOT NULL AND ENAME LIKE ?) OR (DESG IS NOT NULL AND DESG LIKE ?) OR (SALARY IS NOT NULL AND SALARY=?)"; 
	private JdbcTemplate jt;
	
	

	public EmpDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}



	@Override
	public List<EmpResultBO> getEmpList(EmpInputBO ibo) {
		// TODO Auto-generated method stub
		List<EmpResultBO> listRBO=jt.query(GET_EMPLOYEE_QUERY, new ResultSetExtractor<List<EmpResultBO>>() {
		
			@Override
			public List<EmpResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<EmpResultBO> listRBO=null;
				EmpResultBO rbo=null;
				listRBO=new ArrayList<>();
				while(rs.next()) {
					rbo=new EmpResultBO();
					rbo.setEid(rs.getInt(1));
					rbo.setEname(rs.getString(2));
					rbo.setDesg(rs.getString(3));
					rbo.setSalary(rs.getFloat(4));
					rbo.setDeptno(rs.getInt(5));
					rbo.setMgr(rs.getString(6));
					listRBO.add(rbo);
				}
				return listRBO;
			}
			
		}, ibo.getEid(),ibo.getEname(),ibo.getDesg(),ibo.getSalary());
		return listRBO;
	}

}
