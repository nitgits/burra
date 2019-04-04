package com.nit.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nit.command.StudentCommand;

public class InitBinderController extends SimpleFormController {
	
	@Override
	public void initBinder(HttpServletRequest req, ServletRequestDataBinder binder) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		StudentCommand cmd=(StudentCommand)command;
		ModelAndView mav=new ModelAndView();
		mav.addObject("stuCmd", cmd);
		mav.setViewName(getSuccessView());
		return mav;
	}

}
