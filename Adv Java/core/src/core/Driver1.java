package core;
import java.util.Scanner;
interface Vehicle2{
	void engine();
	void breaks();
	void seat();
}

abstract class Car2 implements Vehicle2{
	public void breaks() {
		System.out.println("CAR BREAK : ABES System");
	}
}
class SUV extends Car2{
	public void engine() {
		System.out.println("G class 600 HP");
	}
	public void seat() {
		System.out.println("8 seater");
	}
}
class Sedan extends Car2{
    public void engine() {
		System.out.println("S class 150 HP");
	}
	public void seat() {
		System.out.println("5 seater");
	}
}
class SportsCar extends Car2{
    public void engine() {
		System.out.println("S class 1000 HP");
	}
	public void seat() {
		System.out.println("2 seater");
	}
}

class LuxuryCar extends Car2{
    public void engine() {
		System.out.println("G class 200 HP");
	}
	public void seat() {
		System.out.println("6-10 seater");
	}
}

abstract class Bus2 implements Vehicle2{
	public void breaks() {
		System.out.println("BUS BREAK : Disk Drum + ABES System");
	}
}
class Volvo extends Bus2{
	public void engine() {
		System.out.println("Rear-mounted, 6-cylinder,7-litre diesel , 290 HP");
	}
	public void seat() {
		System.out.println("45 Seater Volvo Bus");
	}
}
class VolvoPlus extends Volvo{
	public void engine() {
		System.out.println("Rear-mounted, 6-cylinder,7-litre diesel , 390 HP , double axle");
	}
	public void seat() {
		System.out.println("45 Seater Volvo plus + 8 sleeper coach");
	}
}

abstract class Truck implements Vehicle2{
	public void breaks() {
		System.out.println("TRUCK BREAK : Advanced ABES System");
	}
}
class AshokLeland extends Truck{
	public void engine() {
		System.out.println("5000 CC  180 HP");
	}
	public void seat() {
		System.out.println("2 seater");
	}
}
/*class User1{
	public static void Run1(Vehicle2 v) {
		v.breaks();
		v.engine();
		v.seat();
	}
}*/
public class Driver1 {
	public static void main(String[] args)
	throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		/*User1.Run1(new Volvo());
		System.out.println();
		User1.Run1(new VolvoPlus());*/
		Scanner s=new Scanner(System.in);
		System.out.println("enter the type of vehicle : ");
		String name=s.nextLine();
		Class c = Class.forName("core."+name);
		Object obj = c.newInstance();
		Vehicle2 v=(Vehicle2)obj;
		v.breaks();
		v.engine();
		v.seat();
						
				
	   
	}
}