package stringhandling;
public class FindLength2{
	public static int findLength(String s1) {
		String s2=s1+'\0';
		int i=0;
		try {
			for(i=0;s2.charAt(i)!=0;i++) {
				
			}
		}catch(Exception e) {
			System.out.println("exception occured");
		}
		return i;
	}	
}