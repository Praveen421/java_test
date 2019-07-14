package collect31;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("afgrm");
		al.add("e");
		al.add("f");
		
		System.out.println(al.size());
		System.out.println(al);
		
		String s1=(String)al.get(0);
		String s2=(String)al.get(4);
		al.set(0, s1.toUpperCase());
		al.set(4, s2.toUpperCase());
		System.out.println(al);
	}
}
