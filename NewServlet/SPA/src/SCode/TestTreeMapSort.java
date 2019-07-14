package SCode;
import java.util.*;
public class TestTreeMapSort {
	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<>();
		tm.put("praveen", 7);
		tm.put("deepak", 6);
		tm.put("pinku", 5);
		tm.put("aniket", 6);
		tm.put("manoj", 5);
		tm.put("majnu", 5);
		System.out.println(tm);
		
		TreeMap<Integer,String> tm1=new TreeMap<>();
		tm1.put(7, "prraveen");
		tm1.put(6, "deepak");
		tm1.put(5, "pinku");
		tm1.put(5, "manoj");
		tm1.put(6, "pankaj");
		System.out.println(tm1);
		
	}
}
