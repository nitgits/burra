package com.nit.service;

import java.util.Calendar;

public class WishMsgServiceImpl implements WishMsgService{
	public String sayWish() {
	 Calendar cal=null;
	 String msg=null;
	 int hour=0;
	 cal=Calendar.getInstance();
	 hour=cal.get(Calendar.HOUR_OF_DAY);
	 if(hour<10) {
		 msg="Good Morning";
	 }
	 else if(hour<16) {
		 msg="Good Afternoon";
	 }
	 else if(hour<22) {
		 msg="Good Evening";
	 }
	 else {
		 msg="Good Night";
	 }
		return msg; 
 }
}
