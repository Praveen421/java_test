package stringTest;
import java.util.*;
public class DuplicatesCount {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String :  ");
		String s=scn.nextLine();
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));		
		
		for(int i=1;i<ch.length;) {
			int count=m1(ch,1,1);
			if(count>1) {
				System.out.println(" "+ch[i]+" comes  "+count+"  times");
				i=i+count;
				count=0;
			}
			else i++;
		}
	}

	public static int m1(char[] ca, int j, int times) {		
		if(ca[j-1]==ca[j]){
			times=times+
			m1(ca,++j,times);
		}
		return times;
	}

	/*public static boolean m2(String a, String b) {		
		return a==b;
	}*/
}
