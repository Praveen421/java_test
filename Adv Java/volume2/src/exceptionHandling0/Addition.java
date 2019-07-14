package exceptionHandling0;
import java.util.*;
public class Addition {
	public static void main(String[] args) {
		try {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter first no. : ");
			int a=scn.nextInt();
			System.out.println("enter the second no. : ");
			int b=scn.nextInt();
			//System.out.println("add : "+(a+b));
			System.out.println("div : "+(a/b));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("add : "+(4+5));
		}
		catch(NumberFormatException e) {
			System.out.println("getMessage() method output ");
			System.out.println(e.getMessage());
			System.out.println("========================\n");
		}
		catch(ArithmeticException e) {
			System.out.println("getMessage() method output ");
			System.out.println(e.getMessage());
			System.out.println("========================\n");
			System.out.println("printStactTrace() method output :");
			e.printStackTrace();
			
			System.out.println("jvm default message : ");
			throw e;
		}
		catch(InputMismatchException e) {
			System.out.println("add : "+(10+11));
		}

	}

}
