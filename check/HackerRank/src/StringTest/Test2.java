package StringTest;
import java.util.*;
public class Test2 {
	public static void main(String[] args) {	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s=scn.nextLine();
		StringBuffer sb=new StringBuffer(); 
		
		System.out.println("sb length : "+sb.length());
		System.out.println("sb capaity : "+sb.capacity());
		
		System.out.println("enter string buffered data : ");		
		sb.append(scn.nextLine());
		System.out.println("\nsb length : "+sb.length());
		System.out.println("sb capacity : "+sb.capacity());
	}
}
