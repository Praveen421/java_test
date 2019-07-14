package collect31;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		for(int i=0;i<=9;i++) {
			v.addElement(new Integer(i*10));
		}
		System.out.println(v);
		for(int i=0;i<=4;i++) {
			v.remove(i);
		}
		System.out.println(v);
	}
}