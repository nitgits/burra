package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.service.WishService;

public class WishController extends AbstractController {
private WishService service;


	public WishController(WishService service) {
	this.service = service;
}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		String result=null;
		result=service.sayHai();
		return new ModelAndView("result","result",result);
	}

}
