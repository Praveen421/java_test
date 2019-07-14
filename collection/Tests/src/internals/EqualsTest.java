package internals;
import java.util.*;
public class EqualsTest {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("p");
		al.add(new StringBuilder("a"));
		al.add(new StringBuilder("b"));
		al.add(new StringBuilder("c")); 
		al.add((Integer)5);
		al.add(new Integer(6));
		StringBuilder sb1=new StringBuilder("d");
		System.out.println(sb1.toString());
		/*System.out.println(al);
		System.out.println(al.contains("p"));
		System.out.println(al.contains(5));
		System.out.println(al.contains(6));
		System.out.println(al.contains(sb1));*/
	}
}