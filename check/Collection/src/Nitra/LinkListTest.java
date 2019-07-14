package Nitra;
import java.util.*;
public class LinkListTest {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i=0;i<15;i++) {
			ll.add(i);
		}
		/*System.out.println(ll);
		ll.add(ll.size(), 15);
		System.out.println(ll);
		for(int x:ll) {
			System.out.println(x);
		}*/
		Iterator itr=ll.listIterator(3);
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	}
}
