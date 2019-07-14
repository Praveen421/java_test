package collect31;
import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		s.push("a");
		s.push(1);
		s.push("b");
		s.push(2);
		s.push("c");
		System.out.println(s.pop());
		System.out.println(s);
		
	}
}
