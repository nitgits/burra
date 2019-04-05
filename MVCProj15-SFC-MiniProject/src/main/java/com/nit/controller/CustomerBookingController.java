package com.nit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nit.command.CustomerCommand;
import com.nit.service.CustomerService;

public class CustomerBookingController extends SimpleFormController {
	private CustomerService service;
	
	

	
	public CustomerBookingController(CustomerService service) {
		this.service = service;
	}

   @Override
	public Map<String,List<String>> referenceData(HttpServletRequest request) throws Exception {
	   
		// TODO Auto-generated method stub
		List<String> booksList,countriesList,gendersList=null,deliverList=null;
		Map<String,List<String>> map=null;
		
		//getting various lists from service
		 booksList=service.getBookItems();
		 countriesList=service.getCountries();
		 gendersList=service.getGenders();
		 deliverList=service.getDeliverList();
		 
		 //added to map
		 map=new HashMap();
		 map.put("booksList", booksList);
		 map.put("countriesList", countriesList);
		 map.put("gendersList", gendersList);
		 map.put("deliverList", deliverList);
		 
		 return map;
	}
	
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		CustomerCommand custCmd=(CustomerCommand)command;
		ModelAndView mav=new ModelAndView();
		mav.addObject("custCmd", custCmd);
		mav.setViewName(getSuccessView());
		return mav;
	}

}
