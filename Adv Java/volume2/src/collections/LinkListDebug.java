package collections;
import java.util.*;
public class LinkListDebug {
	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<>();
		for(int i=0;i<=10;i++) {
			ll.add(i);
		}
		System.out.println("ll contains 3 : "+ll.contains(3));
	}
}