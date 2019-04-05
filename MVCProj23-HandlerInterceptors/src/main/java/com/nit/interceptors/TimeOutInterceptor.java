package com.nit.interceptors;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeOutInterceptor extends HandlerInterceptorAdapter {
	public TimeOutInterceptor() {
		// TODO Auto-generated constructor stub
		System.out.println("TimeOutInterceptor.TimeOutInterceptor()");
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		if(hour<9 || hour>17) {
			RequestDispatcher rd=null;
			rd=request.getRequestDispatcher("/timeout.jsp");
			rd.forward(request, response);
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

}
