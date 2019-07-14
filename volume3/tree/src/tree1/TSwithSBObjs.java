package tree1;
import java.util.*;
public class TSwithSBObjs {
	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add("z");
		ts1.add("d");
		ts1.add("f");
		ts1.add("s");
		ts1.add("a");
		System.out.println(ts1);
		
		TreeSet ts2=new TreeSet(new SBComparator());
		ts2.add(new StringBuilder("a"));
		ts2.add(new StringBuilder("f"));
		ts2.add(new StringBuilder("s"));
		ts2.add(new StringBuilder("a"));
		ts2.add(new StringBuilder("a")); 
		System.out.println(ts2);
	}
}
