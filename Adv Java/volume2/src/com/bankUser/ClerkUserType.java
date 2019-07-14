package com.bankUser;
import com.Bank.blogic.*;
import com.bankExceptions.*;
import java.io.*;

public class ClerkUserType {

	public static void main(String[] args) {
		try {
			BankMainType acc1=new HDFCBankSubType();
			BufferedReader bs=new BufferedReader(new InputStreamReader(System.in));
			
			String option="";
			do {
				try {
					System.out.println("choose one option : ");
					System.out.println("1.Deposite ");
					System.out.println("2.Withdraw ");
					System.out.println("3.Balance enquiry ");
					
					System.out.println("enter option");
					option=bs.readLine();
					
					switch(option) {
					case"1":
					{
						System.out.println("enter deposite amount : ");
						String s=bs.readLine();
						double amt=Double.parseDouble(s);
						acc1.deposite(amt);
						acc1.balanceEnquiry();
						break;
					}
					case"2":
					{
						System.out.println("enter withdraw amount : ");
						String s=bs.readLine();
						double amt=Double.parseDouble(s);
						double withdrawAmt=acc1.withdraw(amt);
						System.out.println("withdrawn amt is : "+withdrawAmt);
						
						acc1.balanceEnquiry();
						break;
					}
					case"3":
					{
						acc1.balanceEnquiry();
						break;
					}
					default:
						System.out.println("invalid option");
					}
				}
				catch(InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				catch(InSufficientFundsException e) {
					System.out.println(e.getMessage());
				}
			}while(option.equalsIgnoreCase("yes"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
