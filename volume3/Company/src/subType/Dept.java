package subType;
import java.util.*;
@SuppressWarnings("unused")
public class Dept {
	public static int getDeptNum(String dname) {
		return DeptMap.getdValue(dname);  
	}
}