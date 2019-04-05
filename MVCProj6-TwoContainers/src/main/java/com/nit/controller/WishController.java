package com.nit.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.service.WishMsgService;

public class WishController extends AbstractController{
	private WishMsgService service;
	
	
	
  public WishController(WishMsgService service) {
		this.service = service;
	}




@Override
protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	 ModelAndView mav=null;
	  String msg=service.sayWish();
	  mav=new ModelAndView();
	
	  mav.addObject("sysDate", new Date());
	  mav.addObject("msg", msg);
	  mav.setViewName("wish");
	  return mav;
}
}
