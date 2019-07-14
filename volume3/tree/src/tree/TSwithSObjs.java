package tree;
import java.util.*;
public class TSwithSObjs {
	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add("g");
		ts1.add("d");
		ts1.add("h");
		ts1.add("b");
		ts1.add("a");
		System.out.println(ts1);
		
		
		TreeSet ts2=new TreeSet(new StringComparator());
		ts2.add("d");
		ts2.add("c");
		ts2.add("b");
		ts2.add("h");
		ts2.add("a");
		System.out.println(ts2);
	}
}
