package core;
import java.util.*;
interface Vehicle{
	abstract void start();
	abstract void move();
	abstract void stop();
}
class Bus implements Vehicle{
	public void start(){
		System.out.println("Bus start");
	}
	public void move(){
		System.out.println("Bus moving");
	}
	public void stop(){
		System.out.println("Bus stop");
	}
}
class Car implements Vehicle{
	public void start(){
		System.out.println("Car start");
	}
	public void move(){
		System.out.println("Car moving");
	}
	public void stop(){
		System.out.println("Car stop");
	}
}
class Bike implements Vehicle{
	public void start(){
		System.out.println("Bike start");
	}
	public void move(){
		System.out.println("Bike move");
	}
	public void stop(){
		System.out.println("Bike stop");
	}
}

public class DepoManager {
	public static void main(String[] args)
	throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		//Driver.drive(new Bus());
		//Driver.drive(new Car());
		//Driver.drive(new Bike());
		//Driver.drive(new Car());
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the vehicle type : ");
		String co =scn.nextLine();
		Class cName=Class.forName("core."+co);
		Object obj = cName.newInstance();
		if(obj instanceof Vehicle) {
			Vehicle v= (Vehicle)obj;
			v.start();
			v.move();
			v.stop();
		}
		
	}
}