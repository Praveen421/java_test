package stringhandling;
import java.util.*;
public class TokenSizerTest {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Hari NareshIT");
		                   new StringTokenizer("Hari NareshIT","a");
		                   new StringTokenizer("Hari NareshIT","a",true);
		                   new StringTokenizer("Hari NareshIT","b",true);
		                   
		                   System.out.println("number of tokens : "+st.countTokens());
		                   while(st.hasMoreTokens()) {
		                	   String token=st.nextToken();
		                	   System.out.println(token);
		                   }
	 
		                   String s1="Hello Praveen Kumar";
		                   String[] s2=s1.split("");
		                   System.out.println(Arrays.toString(s2)+"\n");
		                   
		                   char[] ch1=s1.toCharArray();
		                   byte[] b1=s1.getBytes();
		                   System.out.println("s1 :"+s1);
		                   System.out.println("ch1 : "+Arrays.toString(ch1));
		                   System.out.println("b1 : "+Arrays.toString(b1));
	}
}