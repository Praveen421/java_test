package logical;
import java.util.*;
public class Permncom {
	static int fact(int n) {
		int res=1;
		if(n==1) {
			return n;
		}else {
			return res=n*fact(n-1); 
		}
	}
	static int ncr(int n,int r) {
		int res;	
		res=fact(n)/(fact(n-r)*fact(r));			
		return res; 
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		while(true) {
		   System.out.println("enter N and R : ");
		   int n=scn.nextInt();
		   int r=scn.nextInt();
		   if(n==r) {
			   System.out.println("result is : 1");
		   }else if(n<r){
			   System.out.println("n should greater the r");
		   }else {		
		       System.out.println("factorial of "+n+"="+fact(n)+"...."+r+"="+fact(r));
		      System.out.println("ncr is : "+ncr(n,r));
		   }		   
		}
		
	}

}
