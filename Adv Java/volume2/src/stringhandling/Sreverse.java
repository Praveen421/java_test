package stringhandling;
public class Sreverse {	
		public static String wordReverse(String s1) {
			String[] words=s1.split(" ");
			StringBuffer sb1=new StringBuffer();
			System.out.println();
			for(int i=words.length-1;i>=0;i--) {
				sb1.append(words[i]);
				sb1.append(" ");
			}
			return sb1.toString();
		}
	}