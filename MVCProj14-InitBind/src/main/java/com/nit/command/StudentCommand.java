package com.nit.command;

import java.util.Date;

import lombok.Data;

@Data
public class StudentCommand {
	private int sno;
	private String sname;
	private Date dob,doj,dom;
}
