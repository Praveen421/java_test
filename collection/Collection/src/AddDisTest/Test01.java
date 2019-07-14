package AddDisTest;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		for(byte i=97;i<109;i++) {
			byte[] b= {i};
			String s=new String(b);
			al.add(s);
		}
		al.get(1);
		System.out.println(al);
        for(int i=0;i<al.size();i++) {
        	Object obj=al.get(i);
        	String s1=(String)obj;
        	System.out.print(" "+s1.toUpperCase()+" ");
        }
	}	
}