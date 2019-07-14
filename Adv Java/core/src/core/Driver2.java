package core;
import java.util.*;
interface Vehicle1{
	void engine();
	void breaks();
}
class Bus1 implements Vehicle1{
	public void engine() {
		System.out.println("Volvo engine");
	}
	public void breaks() {
		System.out.println("bus breaks");	
	}
}


class Car1 implements Vehicle1{
	public void engine() {
		System.out.println("Car engine");
	}
	public void breaks() {
		System.out.println("Car breaks");
	}
}


class Bike1 implements Vehicle1{
	public void engine() {
		System.out.println("Bike engine");
	}
	public void breaks() {
		System.out.println("bike breaks");
	}
}


class Run1{
	public static void sendDriver(Vehicle1 v) {
		v.engine();
		v.breaks();
	}
}


public class Driver2 {
	public static void main(String[] args)
	throws ClassNotFoundException,InstantiationException, IllegalAccessException{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the type of vehicle");
		String vehicle=scn.nextLine();
		//load the class
		Class cName=Class.forName("core."+vehicle);
		System.out.println("Loaded class name::"+cName.getName());
		//Instantiate loaddesd class'
		Object obj=cName.newInstance();
		System.out.println("object name:"+obj.getClass().getName());
		if(obj instanceof Vehicle1) {
			Vehicle1 v=(Vehicle1)obj;
			v.breaks();
			v.engine();
		}
		
	}
}