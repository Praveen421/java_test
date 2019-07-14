package StringTest;
import java.util.*;
public class Test7 {
	
	/**
	 * @param args | String 
	 * @param dsfgdf | dgdf
	 * @return int
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first data : ");
		String s0=scn.nextLine(); 
		System.out.println("enter the second data : ");
		StringBuffer sb1=new StringBuffer(scn.nextLine());
		
		System.out.println(s0.contentEquals(sb1)); 
		
	}
}
