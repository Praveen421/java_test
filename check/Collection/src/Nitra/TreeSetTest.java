package Nitra;
import java.util.*;
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		TreeSet<Integer> ts1=new TreeSet<>();
		TreeSet<Object> ts2=new TreeSet<>();
		for(int i=0;i<10;i++) {
			ts.add(i);
		}
		ts1=(TreeSet)ts.headSet(7);
		
		System.out.println(ts);
		System.out.println(ts1);
		//System.out.println(0/0);
		//System.out.println(0%0);
	}
}
