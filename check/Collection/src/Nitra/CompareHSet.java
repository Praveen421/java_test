package Nitra;
import java.util.*;
public class CompareHSet {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Red");
		hs.add("Blue");
		hs.add("Grees");
		//hs.add("Blue");
		hs.add("Violet");
		hs.add("Yellow");
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Red");
		hs1.add("Blue");
		hs1.add("Grees");
		//hs1.add("Blue");
        hs1.add("Black");
		hs1.add("Yellow"); 
		for(String i:hs) {
			if(hs1.contains(i)) {
				System.out.println("yes : "+i);
			}
			System.out.println("No : "+i);
		}
	}
}
