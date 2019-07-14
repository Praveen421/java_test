package Nitra;
import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al=new ArrayList<>();		
		System.out.println(al.get(0));
		System.out.println(al.indexOf(1));
		Collections.sort(al);
		System.out.println("sort : "+al);
		Collections.shuffle(al);
		System.out.println("shuffeled : "+al);
		Collections.reverse(al);
		//ArrayList<Integer> ll=(ArrayList<Integer>)al.clone();
		
		
		
        
		
        
	}
}
