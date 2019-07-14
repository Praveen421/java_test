package uType;
import mainType.*;
import java.util.*;
import addresType.*;
public class HumarnResource {
	public static void main(String[] args) {
		
		EmployeeBean e1=new EmployeeBean(101,"praveen","DEVLOPMENT","java",500);
		EmployeeBean e2=new EmployeeBean(101,"praveen","DEVLOPMENT","java",500);
		HashMap<Object,Object> m=new HashMap<>();
	
		m.put(e1, new Address());
		m.put(e2, new Address());
		//m.put(e3, new Address());
		
		
		System.out.println(m);
		System.out.println(m.size());
	}
}