package com.nit.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class AmoghaMenu {
	private Date date;
	private String type;
	private List<String> items;
	private Map<String,Integer> itemPrices;
	private String todaysSpecial;
	private  int   todaysSepcialPrice;
	private float todaysOffer;
	
	
}
