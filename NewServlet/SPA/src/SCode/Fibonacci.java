package SCode;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no. of iteration : ");
		int n=scn.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<n;i++) {
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
