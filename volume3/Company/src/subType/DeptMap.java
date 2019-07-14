package subType;
import java.util.*;
public class DeptMap {
	private static final HashMap<String,Integer> hm = new HashMap<>(); 
	static {
		  
		hm.put("DEVLOPMENT",1);
		hm.put("MARKETING",2);
		hm.put("HR",3);
		hm.put("PR",4);
	}
	
	public static int getdValue(String dname) {			
		return (int)DeptMap.hm.get(dname.toUpperCase());  
	}	
}