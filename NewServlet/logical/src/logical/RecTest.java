package logical;
import java.util.*;
public class RecTest {
	static int rec(int n) {
		int res;
		if(n==1) {
			return n;
		}else {
			res=n*rec(n-1);
			System.out.println("res : "+res+"   n : "+n);
			return res; 
		}		
	}
	static int recloop(int n) {
		int res=1;
		for(int i=n;i>0;i--) {
			res=res*i;
			System.out.println("res: "+res);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the iteration : ");
		int n=scn.nextInt();
		System.out.println("the res : "+rec(n));
		System.out.println("\n");
		System.out.println("the recloop : "+recloop(n));
	}
}
