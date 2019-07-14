package collect32;
public class Address {
	private String hno,street,city,ph;

	public Address(String hno, String street, String city, String ph) {
		
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.ph = ph;
	}

	@Override
	public String toString() {
		return hno+", "+street+", "+city+", "+ph+"\n";  		
	}
	
}
