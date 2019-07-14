package logical;
import java.util.*;
public class TablePrint {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no . ");
		int n=scn.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d \n",n,i,n*i);
		}
	}

}
