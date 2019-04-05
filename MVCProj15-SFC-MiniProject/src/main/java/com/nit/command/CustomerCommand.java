package com.nit.command;

import lombok.Data;

@Data
public class CustomerCommand {
	private int cid;
	private String dob;
	private String cname;
	private String gender;
	private String items;
	private String deliver;
	private String country;
	private String state;
	private String address;
}
