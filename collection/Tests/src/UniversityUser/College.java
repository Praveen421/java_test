package UniversityUser;
import java.util.*;
import University.Student;
public class College {
	public static void main(String[] args) {
		ArrayList ll=new ArrayList();
		ll.add(new Student(101,"praveen","CJ",1000));
		System.out.println(ll); 
		ll.add(new Student(101,"praveen","CJ",1000));
		System.out.println(ll.size());
	}
}