package internals;
import java.util.*;
public class AddingSearchEmp {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add(new Emp(7369,"praveen",34000,"developer"));
		al.add(new Emp(7354,"XYZ",30000,"HR"));
		System.out.println(al);
		
		System.out.println(al.contains(new Emp(7354,"XYZ",30000,"HR")));
	}
}