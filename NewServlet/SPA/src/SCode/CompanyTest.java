package SCode;
import java.util.*;
public class CompanyTest {
	static int fsum=0;
	public void sum(int num) {
		int r=0,sum=0;
		System.out.printf("\n%d num",num);
		while(num>0) {
			r = num%10;
			sum = sum + r;
			num = num /10;
		}
		System.out.printf("sum %d \n",sum);
		if(sum>=10) {
			this.sum(sum);
		}
		else {
			System.out.printf("Final %d sum %d \n",num,sum);
		}
		
		
	}
	static int count(int no) {
		int count=0;
		while(no!=0) {
			no=no/10;
			count++;			
		}
		return count;
	}
	static void m1(int no) {
		 int sum=0;
		int a=0;
		while(no>0) {
			a=no%10;			
			sum=sum+a;
			no=no/10;
		}
		fsum=sum;
		System.out.printf("\n s=%d",fsum);
		if(sum>=10) {		
			m1(sum);
		}
		
	}
	public static void main(String[] args) {
		Random r=new Random();		
		int a=10+r.nextInt(10000);
		System.out.printf("Number is %d",a);
//		System.out.print(a+"\t\t"+count(a)+"\n");
		 a= 435657567;
		m1(a);
		System.out.printf("the single digit sum is : %d",fsum);
//		System.out.println(10/10);
		
//		CompanyTest m = new CompanyTest();
		
//		m.sum(a);
		
	}
}
