package exceptionhandling;
import java.io.*;
public class BankAccount{
	public static final double MIN_BAL=5000;
	private final long accNum;
	private String accHName;
	private double balance;
	private long mobile;
	private String email;
	
	public BankAccount(long accNum,String accHName,double balance)
	throws IllegalArgumentException{
		if(accNum<=0) {
			throw new IllegalArgumentException("accnum. must be +ve ");
		}
		if(balance<MIN_BAL) {
			throw new IllegalArgumentException("balance must be > = "+MIN_BAL);
		}
		this.accNum=accNum;
		this.balance=balance;
		this.accHName=accHName;
	}
	
	public long getAccNum() {
		return accNum;
	}
	
	public void setAccHName(String accHName) {
		this.accHName=accHName;
	}
	
	public String getAccHName() {
		return accHName;
	}
	
	public void setMobile(long mobile) {
		int digit=String.valueOf(mobile).length();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}