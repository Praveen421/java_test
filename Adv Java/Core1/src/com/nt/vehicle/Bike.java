package com.nt.vehicle;

public class Bike implements Vehicle1 {

	@Override
	public void engine() {
		System.out.println("Bike engine");
	}
	@Override
	public void breaks() {
		System.out.println("bike breaks");
	}

}
