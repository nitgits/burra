package com.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nit.dto.EmpInputDTO;
import com.nit.dto.EmpResultDTO;
import com.nit.service.EmpService;



public class EmpController extends AbstractCommandController{
 private EmpService service;



public EmpController(EmpService service) {
	this.service = service;
}



@Override
protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
		BindException errors) throws Exception {
	ModelAndView mav=null;
	EmpInputDTO dto=null;
	System.out.println(command);
	SearchCommand cmd=(SearchCommand)command;
	//SearchCommand cmd=(Command)command;
	System.out.println(cmd.getEname());
	System.out.println(cmd.getEid());
	System.out.println(cmd.getSalary());
	System.out.println(cmd.getDesg());
	dto=new EmpInputDTO();
	// TODO Auto-generated method stub
	dto.setEid(cmd.getEid());
	dto.setEname(cmd.getEname());
	dto.setDesg(cmd.getDesg());
	dto.setSalary(cmd.getSalary());
	List<EmpResultDTO> listDTO=service.fetchEmpDetails(dto);
     mav=new ModelAndView();
	mav.addObject("listDTO", listDTO);
	mav.setViewName("list_emps");
	return mav;
}
 

 
}
