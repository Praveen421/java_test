package Nitra;
public class NITCollection {
	private  Object[] objArray=new Object[10];
	private int index=0;
	//add method
	public void add(Object ele) {
		if(size()>=capacity()) {
			incrementCapacity();
		}
	
		objArray[index]=ele; 
		index++;
	}
	//size method
	public  int size() { 
		return index; 
	}
	public int capacity() {
		return objArray.length;  
	}
	//incrementCapacity method
	private void incrementCapacity() {
		
		Object[] temp=new Object[capacity()*2];
		for(int i=0;i<capacity();i++) {
			temp[i]=objArray[i];			
		}
;
		objArray=temp;
		
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<capacity();i++) {
			sb.append(objArray[i]);
			sb.append(" , ");
			
		}
		int start=sb.lastIndexOf(",");
		if(start!=-1) {
			sb.delete(start, start+1);
		}		
		sb.append("]");
		return sb.toString();
	}
}
