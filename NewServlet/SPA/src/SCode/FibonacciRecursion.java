package SCode;
import java.util.*;
public class FibonacciRecursion {
	static int a=0,b=1,c,i,n;
	static void m1() {	
		System.out.print(" "+a);
		c=a+b;
		a=b;
		b=c;
		i++;
		if(i<n) {
			m1();
		}
	}
	public static void main(String[] args) {	
		Scanner scn=new Scanner(System.in);		
		System.out.println("enter the no . : ");
		n=scn.nextInt();
		m1(); 
	}
}
