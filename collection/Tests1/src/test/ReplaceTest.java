package test;
import java.util.*;
public class ReplaceTest {
	public static void main(String[] args) {
		ArrayList  col=new ArrayList();
		col.add("a");
		col.add("b");
		col.add("c");
		col.add("d");
		col.add("e");
		col.add("f");
		System.out.println(col);
		
		String s1=(String)col.get(1);
		String s2=(String)col.get(2);
		col.set(0, s2.toUpperCase());
		col.set(1, s1.toUpperCase());
		System.out.println(col);
	}
}