package exceptionHandling0;
import java.io.*;
public class Division {
	public static void div() {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a;
			while(true) {
				try {
					System.out.println("enter first number : ");
					a=Integer.parseInt(br.readLine());
					break;
				}
				catch(NumberFormatException nfe) {
					System.out.println("enter only integer");
				}
			}
			while(true) {
				try {
					System.out.println("enter second number : ");
					int b=Integer.parseInt(br.readLine());
					try {
						int c=a/b;
						System.out.println("result : "+c);
						break;
					}
					catch(ArithmeticException ae) {
						System.out.println("do not pass zero");
					}
				}
				catch(NumberFormatException nfe) {
					System.out.println("enter only integers");
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
