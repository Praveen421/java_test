package internals;
import java.util.*;
public class Performance {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		LinkedList<Object> ll=new LinkedList<>();
		Vector<Object> v=new Vector<>();

		long time1=System.nanoTime();
		for(int i=0;i<2000;i++) {
			al.add(i);
		}
		long time2=System.nanoTime();
		
		long Altime=time2-time1;
		
		System.out.println();
		long time3=System.nanoTime();
		for(int i=0;i<2000;i++) {
			ll.add(i);
		}
		long time4=System.nanoTime();
		
		long lltime=time4-time3;
		System.out.println();		
		long time5=System.nanoTime();
		for(int i=0;i<2000;i++) {
			v.add(i);
		}
		long time6=System.nanoTime();
		long vtime=time6-time5;
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}