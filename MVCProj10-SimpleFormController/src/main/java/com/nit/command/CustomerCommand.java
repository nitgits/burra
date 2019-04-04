package com.nit.command;

import lombok.Data;

@Data
public class CustomerCommand {
	
	public CustomerCommand() {
		System.out.println("CustomerCommand.CustomerCommand()");
	}
private String cname="Rani";
private String cadd="Hyd";
//private long mobileno;
//private float billamt;

private Long mobileno;
private Float billamt;

}
