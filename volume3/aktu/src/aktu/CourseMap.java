package aktu;
import java.util.*;
public class CourseMap {
	private static final HashMap<String,Integer> hm;
	static {
		hm=new HashMap<>();
		
		hm.put("CJ", 1);
		hm.put("AJ", 2);
		hm.put("FW", 3);
		hm.put("UI", 4);
		hm.put("DS", 5);
	}
	public static int getCourseNum(String course) {		
		return (int)CourseMap.hm.get(course.toUpperCase()); 
	}
}