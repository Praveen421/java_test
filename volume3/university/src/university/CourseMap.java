package university;
import java.util.*;
public class CourseMap {
	private static final HashMap<String,Integer> courseMap;
	static {
		courseMap=new HashMap<>();
		courseMap.put("C",1);
		courseMap.put("ORACLE",2);
		courseMap.put("CJ",3);
		courseMap.put("AJ",4);
		courseMap.put("SPRING",5);
		courseMap.put("PROJECT",6); 
		
	}
	
	public static int getCourseValue(String c) {
		return (int)CourseMap.courseMap.get(c.toUpperCase());  
	}	
}