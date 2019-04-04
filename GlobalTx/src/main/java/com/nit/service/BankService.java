package com.nit.service;


public interface BankService {
	public int withdraw(int acc,float amt);
	public int deposit(int acc,float amt);
	public Boolean transferMoney(int srcAcc,int destAcc, float amt);
public int getData();
}
