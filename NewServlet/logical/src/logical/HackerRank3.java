package logical;
import java.util.*;
public class HackerRank3 {

	public static void main(String[] args) {
		//double a=0,b=2,n=10;
		
		Scanner scn=new Scanner(System.in);
		System.out.println(" ");
		int iteration=scn.nextInt();
		double[] a=new double[iteration];
		double[] b=new double[iteration];
		double[] n=new double[iteration];
	
		for(int i=0;i<iteration;i++) { 
			a[i]=scn.nextInt();
			b[i]=scn.nextInt();
			n[i]=scn.nextInt();
		}
		for(int i=0;i<iteration;i++) {
			double p=a[i];
			double q=b[i];
			double r=n[i];
			double sum=0;
			for(double j=0;j<r;j++) {
				if(j==0) {
				sum=sum+(p+q*Math.pow(2, j));
				System.out.print((int)sum+" ");
				}
				else {
				sum=sum+q*Math.pow(2, j); 
				System.out.print((int)sum+" ");
				}				
			}
			System.out.println();
		}
	}

}
