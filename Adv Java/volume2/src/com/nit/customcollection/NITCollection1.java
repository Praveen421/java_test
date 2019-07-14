package com.nit.customcollection;
import java.util.*;
public class NITCollection1 {
	private Object[] objArray;
	private int elementCount;
	Scanner scn=new Scanner(System.in);
	
	public NITCollection1(int a) {		
		objArray=new Object[a];
		System.out.println("array size is : "+objArray.toString());
		elementCount=0;
	}
	
	public void add(Object obj) {
		if(elementCount==objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount++]=obj;
		
	}
	
	
	
	private void increaseCapacity() {
		Object[] nextObjArray=new Object[objArray.length];
		for(int i=0;i<=objArray.length;i++) {
			nextObjArray[i]=objArray[i];
		}
		objArray=nextObjArray;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<objArray.length;i++) {
			sb.append(objArray[i]);
			sb.append(",");
		}
		int start=sb.lastIndexOf(",");
		if(start!=-1) {
			sb.delete(start, start+1);
		}
		sb.append("]");
		return sb.toString();
	}
}
















