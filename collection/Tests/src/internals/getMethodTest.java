package internals;
import java.util.*;
public class getMethodTest {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("praveen");
		al.add("sidd");
		al.add("3");
		al.add(2);
		al.add("xyz");
		al.add(5.7);
		al.add("@");
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			String s;
			if(obj instanceof String ) {
				s=(String)obj;
				System.out.println(s.toUpperCase());
			}
		}
		
	}	
}