package SCode;
import java.util.regex.*;
import java.util.*;
import java.util.regex.Pattern;
public class PasswordTest {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter hte string :");
		Pattern p=Pattern.compile("((?=.*[A-Z])|(?=.*[0-9])).{8,10}");
		Matcher m=p.matcher(scn.nextLine());
		if(m.find()) {
			System.out.println("valid password ");
		}
		else {
			System.out.println("not valid");
		}
	}
}
