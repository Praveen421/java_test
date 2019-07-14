package com.Bank.blogic;
import com.bankExceptions.*;
public class HDFCBankSubType implements BankMainType{
	
	private double balance;	

	public void deposite(double amt) 
			throws InvalidAmountException{
		if(amt<=1000) {
			throw new InvalidAmountException(amt+"min. deposit amount is 1000...");
		}
		balance=balance+amt;
	}
	
	public double withdraw(double amt)
			throws InvalidAmountException,InSufficientFundsException{
		if(amt<=0) {
			throw new InvalidAmountException(amt+"amount must be +ve ...");			
		}
		if(amt<balance) {
			throw new InSufficientFundsException(amt+"Insufficient funds ...");			
		}
		balance=balance-amt;
		return amt;
		
	}
	
	public void balanceEnquiry() {
		System.out.println("your available balance is : "+balance);
	}
}