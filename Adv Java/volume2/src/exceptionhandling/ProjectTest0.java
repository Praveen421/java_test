package exceptionhandling;
import java.util.*;
public class ProjectTest0 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		BankAccount b1;
		try {
			System.out.println("enter account no. : ");
			long aNum=scn.nextLong();
			System.out.println("enter account holder name : ");
			String aHName=scn.nextLine();
			System.out.println("enter balance : ");
			double balance=scn.nextDouble();
			
			b1=new BankAccount(aNum,aHName,balance);
		}catch(Exception e) {
			e.getMessage();
		}
	}

}