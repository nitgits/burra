package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nit.command.CustomerCommand;
import com.nit.dto.CustomerDTO;
import com.nit.service.CustomerService;

public class CustomerRegisterController extends SimpleFormController {
	
	private CustomerService  service;

	public CustomerRegisterController(CustomerService service) {
		this.service = service;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		CustomerCommand cmd=(CustomerCommand)command;
		if(cmd.getCadd().equalsIgnoreCase("Hyderabad")) {
		errors.rejectValue("cadd", "customer.cadd.restriction");
			return showForm(request, errors, getFormView());
		}
		CustomerDTO dto=new CustomerDTO();
		dto.setBillamt(cmd.getBillamt());
		dto.setCadd(cmd.getCadd());
		dto.setCname(cmd.getCname());
		dto.setMobileno(cmd.getMobileno());
		
		String res=service.register(dto);
		ModelAndView mav=new ModelAndView();
		mav.addObject("result",res);
		mav.setViewName("result");
		return mav;
	}
	
	 
	// removing Double Posting problem
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("double_post");
	}

	// Command Object creation manuvally
	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		CustomerCommand cmd=new CustomerCommand();
		cmd.setCname("meghana");
		cmd.setCadd("Vjy");
		cmd.setMobileno(2124578541l);
		cmd.setBillamt((float)Math.random()*1000f);
		return cmd;
	}
}
