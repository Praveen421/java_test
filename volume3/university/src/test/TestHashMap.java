package test;
import java.util.*;
import Branch.Student;
import add.*;
public class TestHashMap {
	public static void main(String[] args) {
		
		Student s1=new Student(101,"praveen","CJ",1000);
		HashMap<Object,Object> hm=new HashMap<>();
		hm.put(s1, new Address());
		System.out.println(hm);
		
		
	}
}