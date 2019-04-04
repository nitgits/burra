package com.nit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nit.command.RegistrationCommand;
import com.nit.dto.RegDTO;
import com.nit.service.RegistrationService;

public class RegistrationController extends SimpleFormController {
	private RegistrationService service;

	public RegistrationController(RegistrationService service) {
		this.service = service;
	}
	
	 @Override
	public Map referenceData(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		List<String> coursesList=service.getCourses();
		List<String> hobbiesList=service.getHobbies();
		List<String> gendersList=service.getGenders();
		List<String> countriesList=service.getCountries();
		Map<String,List<String>> map=new HashMap();
		map.put("coursesList", coursesList);
		map.put("hobbiesList", hobbiesList);
		map.put("gendersList", gendersList);
		map.put("countriesList", countriesList);
		
		return map;
		
	}
	
	 @Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		 RegistrationCommand cmd=(RegistrationCommand)command;
		 RegDTO dto=null;
		 ModelAndView mav=null;
		 dto=new RegDTO();
		 
		 
		 BeanUtils.copyProperties(cmd, dto);
		String resMsg= service.register(dto);
		mav=new ModelAndView();
		mav.addObject("resMsg", resMsg);
		mav.addObject("regCmd", cmd);
		mav.setViewName(getSuccessView());
		return mav;
	}

}
