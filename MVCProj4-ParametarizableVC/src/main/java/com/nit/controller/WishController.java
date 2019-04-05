package com.nit.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		Date date=null;
		String msg=null;
		ModelAndView mav=null;
		date=new Date();
		int time=date.getHours();
		if(time<10) {
			msg="Good Morning";
		}
		else if(time<16) {
			msg="Good Afternoon";
		}
		
		else if(time<22){
			msg="Good Evening";
		}
		else if(time<24) {
			msg="Good Night";
		}
		mav=new ModelAndView();
		mav.setViewName("result");
		mav.addObject("sysDate", date);
		mav.addObject("msg", msg);
		return mav;
	}

}
