package frustate;
import java.util.*;
public class StringTest01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("===============");
		for(int i=0;i<3;i++) {
			
			  String s=scn.next();
			  int n=scn.nextInt();
			  System.out.print(s);
			  for(int j=0;j<15-s.length();j++) {
				System.out.printf(" ");
				
			}
			  System.out.printf("%03d\n",n);
		   
		}
		
		System.out.println("==============");
	}
}
