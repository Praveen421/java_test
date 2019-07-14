package collect32;
public class Customer {
	String name;
	int age;
	Address address;
	public Customer(String name, int age, Address address) {		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return " "+ name + ", " + age + ", " + address + ""; 
	}
	
	
}
