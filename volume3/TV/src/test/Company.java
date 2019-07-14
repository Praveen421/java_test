package test;
import java.util.*;
public class Company {
	public static void main(String[] args) {
		Customer c1=new Customer("praveen","VNS","STAR PLUS",101);
		Customer c2=new Customer("praveen","VNS","STAR PLUS",101);
		Customer c3=new Customer("praveen","VNS","STAR PLUS",101);
		Customer c4=new Customer("praveen","VNS","STAR PLUS",101);
		Customer c5=new Customer("praveen","VNS","STAR PLUS",101);
		HashMap<Customer,Address> hm1=new HashMap<>();
		hm1.put(c1, new Address());
		hm1.put(c2, new Address());
		System.out.println(hm1);
	}
}
