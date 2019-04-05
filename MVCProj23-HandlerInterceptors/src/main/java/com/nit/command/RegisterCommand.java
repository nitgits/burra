package com.nit.command;

import lombok.Data;

@Data
public class RegisterCommand {
	private String name;
	private String desg;
	private Float salary;
	private Float expectedSalary;
	private String preferredLocation;
	private String addrs;
	private Integer experience;
	

}
