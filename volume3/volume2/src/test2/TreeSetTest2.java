package test2;
import java.util.*;
public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet<Object> ts= new TreeSet<>();
		ts.add(new Student1(100,"praveen","java"));
		ts.add(new Student1(101,"praveen","AJ"));
		ts.add(new Student1(100,"praveen","Oracle"));
		ts.add(new Student1(103,"praveen","SPRING"));
		System.out.println(ts.size());
		System.out.println(ts); 
		/*TreeSet ts2=new TreeSet<>(new Student2comparator()); 
		ts2.add(104,"praveen","SPRING");*/
		
	}
}