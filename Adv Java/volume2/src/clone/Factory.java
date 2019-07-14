package clone;
class Bike implements Cloneable{
	private int engineNumber;
	private int modelNumber;
	private String type;
	private int bikeNumber;
	
	public Bike(int engineNumber,int modelNumber,String type) {
		this.engineNumber=engineNumber;
		this.modelNumber=modelNumber;
		this.type=type;
	}
	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber=bikeNumber;
	}
	public Bike clone() throws CloneNotSupportedException {
		Bike newBike=(Bike)super.clone();
		newBike.engineNumber=this.engineNumber+10;
		return newBike; 
	}
	public String toString() {
		return "Bike number : "+bikeNumber+"\n"+"Engine number : "+engineNumber+"\n"+"Model number : "
	+modelNumber+"\n"+"type : "+type;
	}
}
public class Factory {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bike b1=new Bike(1234,2102,"pulsar 180CC");
		Bike b2=(Bike)b1.clone();
		System.out.println(b1==b2);
		
		b1.setBikeNumber(8192);
		b2.setBikeNumber(8193);
		System.out.println("b1 object details : ");
		System.out.println(b1);
		System.out.println(b2);
	}
}