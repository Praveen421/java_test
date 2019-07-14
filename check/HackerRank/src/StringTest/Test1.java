package StringTest;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {	
		Scanner scn=new Scanner(System.in);
		/*System.out.println("enter the position : ");
		int n=Integer.parseInt( scn.nextLine());
		System.out.println("char at position "+n+" is : "+s.charAt(n )); 
		System.out.println("string before "+n+" is: "+s.substring(0,n));*/
		while(true) {
		   System.out.println("enter the first string : ");
		   String s1=scn.nextLine();
		   System.out.println("enter the second string : ");
		   String s2=scn.nextLine();
		   int i=s1.compareTo(s2);
		   if(i==0) {
			  System.out.println("strings are same");
		   }
		   else if(i>0) {			   
			  System.out.println("first string is big");
		   }else {
			  System.out.println("second string is big");
		  }
	   }		
	 } 
}
