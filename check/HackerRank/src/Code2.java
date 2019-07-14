import java.util.*;
public class Code2 {
	public static void main(String[] args) {	
		Scanner scn=new Scanner(System.in);
		System.out.println();
		int a=Integer.parseInt(scn.nextLine());
		if((a%2)!=0) {
			System.out.println("Weird");
		}else if((a%2==0)&(a>=2)&(a<=5)) {
			System.out.println("Not Weird");
		}else if((a%2==0)&(a>=6)&(a<=20)) {
			System.out.println("Weird");
		}else if(a>20) {
			System.out.println("Weird");
		}
		scn.close();
	}
}
