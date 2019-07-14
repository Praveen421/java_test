package LIT;
import java.util.*;
public class CourseMap {
	private static final HashMap<String,Integer> hm;
	static {
		hm=new HashMap<>();
		hm.put("CJ", 1);
		hm.put("AJ", 2);
		hm.put("C", 3);
		hm.put("ORACLE", 4);
		hm.put("SPRING", 5);
	}
	@SuppressWarnings("unused")
	static int getCourseVal(String course) {
		return (int)CourseMap.hm.get(course.toUpperCase()); 
	}
}
