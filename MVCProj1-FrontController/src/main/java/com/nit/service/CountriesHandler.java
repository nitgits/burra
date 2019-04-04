package com.nit.service;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountriesHandler implements Handler {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		Locale[] locale=null;
		String country=null;
		
		locale=Locale.getAvailableLocales();
		for(Locale l:locale) {
			country=l.getDisplayCountry();
			
		}
		req.setAttribute("country", country);
		return "show_country";
	}

}
