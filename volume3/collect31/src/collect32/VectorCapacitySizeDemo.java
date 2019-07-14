package collect32;
import java.util.*;
public class VectorCapacitySizeDemo {
	public static void main(String[] args) {
	Vector<Object> v=new Vector<>(3);
	System.out.println("intial capacity : ");
	System.out.println(v.capacity()+"\t"+v.size());
	v.add(new Customer("Praveen",22,new Address("2-3-102","phulwariya","VNS","7065236921")));
	System.out.println(v);
	v.add(new Customer("Rishab",22,new Address("3-3-104","chunar","MZP","988765543")));
	
	System.out.println(v);
	System.out.println("intial capacity : ");
	System.out.println(v.capacity()+"\t"+v.size());
	
	}
}
