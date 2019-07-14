package stringhandling;

import java.util.Arrays;

public class ValueOfTest {

	public static void main(String[] args) {
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf("a10"));
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(new char[] {'a','b'}));
		//System.out.println(String.valueOf(null));
		System.out.println(String.valueOf((String)null));
		System.out.println(String.valueOf((A)null)); //important
		System.out.println(String.valueOf(new ValueOfTest()));
		
	}
}