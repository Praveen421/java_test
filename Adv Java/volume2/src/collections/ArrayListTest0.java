package collections;
import java.util.*;
public class ArrayListTest0 {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		LinkedList<Object> ll=new LinkedList<>();
		System.out.println(al);
		for(int i=0;i<=10;i++) {
			al.add(i);
			ll.add(i);
		}
		
		System.out.println("al: "+al);
		System.out.println("ll: "+ll);
		ArrayList<Object> al1=new ArrayList<>();
		al1.add("a");
		al1.add(5);
		al1.add("b");
		al1.add(5.7);
		al1.add('a');
		al1.add("a");
		
		System.out.println(al1);
		System.out.println("al1 contains 'a' : "+al1.contains('a'));
		System.out.println("al1 contains \"a\" : "+al1.contains("a"));
		System.out.println("al1 contains \"c\" : "+al1.contains("c"));
		System.out.println("ll contains 1 : "+ll.contains(1));
		System.out.println("ll contains 1 : "+ll.contains(11));
		
	}
}