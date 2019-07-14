package UniversityHelper;
import java.util.HashMap;
public class CourseMap {
	private static HashMap<String,Integer> course=new HashMap<>();
	static {
		course.put("CJ", 1);
		course.put("AJ", 2);
		course.put("HN", 3);
		course.put("SP", 4);
		course.put("XML", 5);
		course.put("PRO", 6); 

   }
	public static int get(String course) {
		return (Integer)CourseMap.course.get(course.toUpperCase());
	}	
} 