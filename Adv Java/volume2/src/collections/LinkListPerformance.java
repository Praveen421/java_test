package collections;
import java.util.*;
public class LinkListPerformance {
	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		ArrayList<Object> al=new ArrayList<>();
		LinkedList<Object> ll=new LinkedList<>();
		long time1=System.nanoTime();
		for(int i=1;i<=200000;i++) {
			v.add(new Integer(i));
			al.add(new Integer(i));
			ll.add(new Integer(i));
		}
		long time2=System.nanoTime();
		System.out.println("Vector time taken        : "+(time2-time1));
		
		long time3=System.nanoTime();
		for(int i=1;i<=200000;i++) {
			
			al.add(new Integer(i));
			
		}
		long time4=System.nanoTime();
		System.out.println("Array time taken         : "+(time4-time3));
		
		long time5=System.nanoTime();
		for(int i=1;i<=200000;i++) {			
			ll.add(new Integer(i));
		}
		long time6=System.nanoTime();
		System.out.println("LinkedList time taken    : "+(time6-time5));
		
		System.out.println(ll);
		/*LinkedList<Object> l1=new LinkedList<>();
		l1.add("a");
		l1.add(20);
		System.out.println(l1.get(0));
		System.out.println(l1);
		System.out.println(l1.get(1));
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}