package com.nit.customcollection;

public class TestNITCollection {

	public static void main(String[] args) {
		NITCollection col=new NITCollection();
		col.add("a");
		col.add(5);
		System.out.println(col);
		System.out.println(col.hashCode());

	}

}
