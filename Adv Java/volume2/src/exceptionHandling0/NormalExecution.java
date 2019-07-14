package exceptionHandling0;
import java.util.*;
import java.io.*;
public class NormalExecution {
	public static void main(String[] args) throws IOException {
		
		int a=0;
		try {
			Scanner scn=new Scanner(System.in);
			while(true) {
				
				System.out.println("enter first no. : ");
				a=scn.nextInt();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("only integers");
			main(args);
		}
		try {
			while(true) {
				Scanner scn=new Scanner(System.in);
				System.out.println("enter the second no. : ");
				int b=scn.nextInt();
				try {
					
					int c=a/b;
					System.out.println("result : "+c);
					break;
				}
				catch(ArithmeticException e) {
					System.out.println("donot pass zero");
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("only integers");
		}
	
	
}
}














