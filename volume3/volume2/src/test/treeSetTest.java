package test;
import java.util.*;
public class treeSetTest {
	public static void main(String[] args) {
		
		TreeSet<Character> ts=new TreeSet<>();
		ts.add('a');
		ts.add('d');
		ts.add('b');
		ts.add('c');
		ts.add('a');
		System.out.println(ts.size());
		System.out.println(ts);
	}
}