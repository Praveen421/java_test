package com.nit.customcollection;
public class NITCollection {
	private Object[] objArray;
	private int elementCount;
	
	public NITCollection() {
		objArray=new Object[10];
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
		nextObjArray=objArray;
	}
	
	
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(objArray);
	}
}