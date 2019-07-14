package SCode;
import java.util.*;
public class ReverseDigit {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the digit : ");
		String s=scn.nextLine();
		int n=Integer.parseInt(s);
		for(int i=0;i<s.length();i++) {
			System.out.print(n%10);
			n=n/10;
		}
		
		System.out.println("\n enter the String : ");
		int count=0;
		String s1=scn.nextLine();
		String[] sa=s1.split("");
		for(int i=s1.length()-1, j=0;j<i/2;j++) {
			if(sa[i]==sa[j]) {
				count++;
				continue;
			}else {				
				count=0;
			}			
		}
		if(count!=0) {
			System.out.println("palindrome");
		}else {
			System.out.println(" not palindrome");
		}
	}
}
