package test02;
import java.util.*;
public class Test_join {
	public static void main(String[] args) {
		String s1=String.join("-", "a","b","c");
		String s2=String.join("", "a","b","c");
		String s3=String.join("-");
		String s4=String.join("-", "my", "name", "is", "praveen");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
