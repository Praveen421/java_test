package SCode;
import java.util.*;
import java.util.regex.*;
public class RegularExpression {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the pattern to match : ");
		Pattern p=Pattern.compile(scn.nextLine());
		System.out.println("enter the Sentence :");
		Matcher m=p.matcher(scn.nextLine());
		while(m.find()) {
			System.out.println(m.start()+"..."+m.end()+"..."+m.group());
		}
		System.out.println("enter the new string :");
		String s=scn.nextLine();
		String[] sa=s.split(" ");
		System.out.println(Arrays.toString(sa));
		for(String a:sa) {
			System.out.print(a);
		}
	}
}
