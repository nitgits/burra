
package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nit.bo.EmpInputBO;
import com.nit.bo.EmpResultBO;
import com.nit.dao.EmpDAO;
import com.nit.dto.EmpInputDTO;
import com.nit.dto.EmpResultDTO;

public class EmpServiceImpl implements EmpService {
 private EmpDAO dao;
 
 
	public EmpServiceImpl(EmpDAO dao) {
	this.dao = dao;
}


	@Override
	public List<EmpResultDTO> fetchEmpDetails(EmpInputDTO edto) {
		EmpInputBO ibo=new EmpInputBO();
	   EmpResultDTO rdto=null;
	   List<EmpResultDTO> listRDTO=null;
	   listRDTO=new ArrayList<>();
		BeanUtils.copyProperties(edto, ibo);
	     List<EmpResultBO> listRBO=dao.getEmpList(ibo);
	     for(EmpResultBO rbo:listRBO) {
	    	 rdto=new EmpResultDTO();
	    	 BeanUtils.copyProperties(rbo, rdto);
	    	 listRDTO.add(rdto);
	     }
		return listRDTO;
	}

	
}
