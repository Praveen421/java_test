package logical;
import java.util.*;
public class HackerRank2 {

	public static void main(String[] args) {	
		Scanner scn=new Scanner(System.in);
		System.out.println("");
		String[] sa=new String[3];
		int[] ia=new int[3];
		for(int i=0;i<3;i++) {
			sa[i]=scn.next();			
			ia[i]=Integer.parseInt(scn.next());			
		}		
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			System.out.printf("%-15s%03d%n", sa[i], ia[i]);
		}
		System.out.println("================================");
	}

}
