package Nitra;
import java.util.*;
public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("RED");
		hs.add("Blue");
		hs.add("Green");
		hs.add("Blue");
		hs.add("Black");
		hs.add("Orange");
		System.out.println(hs.size());
		Iterator itr=hs.iterator();
		int i=0;
		while(itr.hasNext()) {
			System.out.println(itr.next());
			i++;			
		}
		String[] s=new String[hs.size()];
		hs.toArray(s);
		for(String x:s) {
			System.out.println(x);
		}
	}
}
