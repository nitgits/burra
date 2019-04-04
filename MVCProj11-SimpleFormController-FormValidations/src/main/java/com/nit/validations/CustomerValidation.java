package com.nit.validations;

import org.springframework.validation.Errors;

import org.springframework.validation.Validator;

import com.nit.command.CustomerCommand;
/**
 * This class for Validatng the Customer Registration
 * 
 * Author Rani B
 */
public class CustomerValidation implements Validator {
 /**
  * This method decides on which class we want to perform validation
  * 
  */
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz==CustomerCommand.class;
	}

	/**
	 * 
	 * (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		CustomerCommand cmd=(CustomerCommand)target;
		if(cmd.getVflag().equalsIgnoreCase("no")) {
			System.out.println("servxer sidess");
		if(cmd.getCname()==null || cmd.getCname().equalsIgnoreCase("") || cmd.getCname().length()==0)
			errors.rejectValue("cname", "customer.cname.reqiured");
		
		if(cmd.getCadd()==null || cmd.getCadd().equalsIgnoreCase("") || cmd.getCadd().length()==0)
			errors.rejectValue("cadd", "customer.cadd.required");
		
		if(cmd.getMobileno()==null)
			errors.rejectValue("mobileno", "customer.mobileno.required");
		else if(cmd.getMobileno().toString().length()!=10) 
			errors.rejectValue("mobileno", "customer.mobileno.length");
		
		
		if(cmd.getBillamt()==null)
			errors.rejectValue("billamt", "customer.billamt.required");
	    else if(cmd.getBillamt()<0 || cmd.getBillamt()>10000)
	    	errors.rejectValue("billamt", "customer.billamt.length");
		}

   }// method
}//validator