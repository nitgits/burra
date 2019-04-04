package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nit.command.UserCommand;

public class CrudOperationsController extends MultiActionController{
	
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,UserCommand cmd) {
		return new ModelAndView("user","resMsg","inserted");
	}
	
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res,UserCommand cmd) {
		return new ModelAndView("user","resMsg","updated");
	}
	
	
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,UserCommand cmd) {
		return new ModelAndView("user","resMsg","deleted");
	}
	
	
	public ModelAndView view(HttpServletRequest req,HttpServletResponse res,UserCommand cmd) {
		return new ModelAndView("user","resMsg","view");
	}
	
/*	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,UserCommand cmd) {
		return new ModelAndView("user","resMsg","invalid");
	}*/

}
