package university;
import java.util.*; 
@SuppressWarnings("unused")
public class College {
	public static int getCourseNum(String course) {
		return CourseMap.getCourseValue(course);  
	}
}