package com.nit.service;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LanguagesHandler implements Handler {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("haiiiiiiiiiiii");
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap();
		Locale[] locale=null;
		String lang=null;
		
		locale=Locale.getAvailableLocales();
		for(Locale l:locale) {
			 lang=l.getDisplayLanguage();
			 
		}
		req.setAttribute("lang", lang);
		return "show_lang";
	}

}
