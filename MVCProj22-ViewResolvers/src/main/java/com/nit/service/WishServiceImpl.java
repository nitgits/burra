package com.nit.service;

import java.util.Calendar;

public class WishServiceImpl implements WishService {

	@Override
	public String sayHai() {
		// TODO Auto-generated method stub
		Calendar cal=null;
		int hour=0;
		String result=null;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour>8) {
			result= "Good Morning";
		}
		else if(hour>20) {
			result= "Good Afternoon";
		}
		return result;
	}

}
