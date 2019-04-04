package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.service.CountriesHandler;
import com.nit.service.Handler;
import com.nit.service.LanguagesHandler;

public class LocaleFrontControllerServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Handler handler=null;
		RequestDispatcher rd=null;
		
		String path=req.getServletPath();
		System.out.println(path);
		if(path.equalsIgnoreCase("/lang.do")) {
			System.out.println("ddddd");
			handler=new LanguagesHandler();
		}
		else if(path.equalsIgnoreCase("/country.do")) {
			handler=new CountriesHandler();
		}
		
		try {
			String lvn=handler.execute(req, res);
			if(lvn.equalsIgnoreCase("show_country")) {
				rd=req.getRequestDispatcher("/WEB-INF/pages/show_country.jsp");
				rd.forward(req, res);
			}
			else if(lvn.equalsIgnoreCase("show_lang")) {
				rd=req.getRequestDispatcher("/WEB-INF/pages/show_lang.jsp");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
