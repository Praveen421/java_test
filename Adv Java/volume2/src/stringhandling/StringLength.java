package stringhandling;
import java.util.*;
public class StringLength {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1=scn.nextLine();
		int lenght=FindLength2.findLength(s1);
		//System.out.println(s1);
		System.out.println(lenght);
		
	}
}