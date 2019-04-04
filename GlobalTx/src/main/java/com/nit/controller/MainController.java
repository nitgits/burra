package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.BankService;

/**
 * Servlet implementation class MainController
 */

public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BankService proxy=null;
	ApplicationContext ctx=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
    	
        super();
        System.out.println("controller");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		proxy=ctx.getBean("bankService",BankService.class);
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int srcAcc=0,destAcc=0;
		float amount=0.0f;
		Boolean status=false;
		RequestDispatcher rd=null;
		
		srcAcc=Integer.parseInt(req.getParameter("srcAcc"));
		destAcc=Integer.parseInt(req.getParameter("destAcc"));
		amount=Float.parseFloat(req.getParameter("amount"));
		try {
		status=proxy.transferMoney(srcAcc,destAcc,amount);
		System.out.println(status);
		req.setAttribute("status", status);
		rd=req.getRequestDispatcher("/result.jsp");
	
		
		}catch(Exception e) {
			e.printStackTrace();
			
				rd=req.getRequestDispatcher("/error.jsp");
			
		}
		
		rd.forward(req, res);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		((AbstractApplicationContext) ctx).close();
	}

}
