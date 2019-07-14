package com.nit.customcollection;
import java.util.*;
public class TestNITCollection1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of array required ");
		int a=scn.nextInt();
		NITCollection1 col=new NITCollection1(a);
		col.add("a");
		System.out.println(col.toString());
	}
}