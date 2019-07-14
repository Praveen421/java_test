package Nitra;
import java.util.*;
public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<15;i++) {
			al.add(i);
		}
		System.out.println("without : "+al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.println(i);
			}else {
				itr.remove();
			}
			//System.out.println(al);
		} 
		System.out.println(al);
	}
}
