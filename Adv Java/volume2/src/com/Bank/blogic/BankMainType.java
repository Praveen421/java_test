package com.Bank.blogic;
import com.bankExceptions.*;
public interface BankMainType {
	public void deposite(double amt) 
	throws InvalidAmountException;
	
	public double withdraw(double amt)
	throws InvalidAmountException,InSufficientFundsException;
	
	public void balanceEnquiry();
}