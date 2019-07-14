package test1;
import java.util.*;
public class treeSetTest1 {
	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(new Student(100,"praveen","java"));
		ts.add(new Student(101,"praveen","java"));
		ts.add(new Student(100,"praveen","java"));
		ts.add(new Student(101,"praveen","java"));
		System.out.println(ts.size());
		System.out.println(ts);
	}
}
