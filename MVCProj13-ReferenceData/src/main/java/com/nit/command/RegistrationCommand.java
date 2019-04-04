package com.nit.command;

import lombok.Data;

@Data
public class RegistrationCommand {
	private Integer cno;
	private String cname="Jhon";
	private String[] hobbies;
	private String countries;
	private String gender;
	private String[] courses; 

}
