package stringTest;
import java.util.*;
public class DuplicatesTest1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String :  ");
		String s=scn.nextLine();
		int count=0;
	    for (int i = 0; i < s.length(); i++) {

	        for (int j = i; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                count++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+count);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        count = 0; 
	    }
	}
}