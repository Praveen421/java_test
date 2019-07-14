package com.nt.test;
import java.util.Scanner;
import com.nt.vehicle.*;



class Train{
	
}
public class Driver2 {
	public static void main(String[] args)
	throws ClassNotFoundException,InstantiationException, IllegalAccessException{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the type of vehicle::");
		String vehicle=scn.next();
		System.out.println(vehicle);
		//load the class
		Class cName=Class.forName(vehicle);
		System.out.println("Loaded class name::"+cName.getClass().getName());
		//Instantiate loaddesd class'
		Object obj=cName.newInstance();
		
		if(obj instanceof Vehicle1) {
			Vehicle1 v=(Vehicle1)obj;
			v.breaks();
			v.engine();
		}
		
	}
}