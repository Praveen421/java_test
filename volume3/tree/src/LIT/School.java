package LIT;
import java.util.*;
public class School {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet<Student> ts1=new TreeSet<Student>();
		ts1.add(new Student(101,"praveen","CJ",20000,5.6));
		ts1.add(new Student(102,"praveen","CJ",20000,5.6));
		ts1.add(new Student(101,"praveen","AJ",20000,5.6));
		ts1.add(new Student(101,"praveen","Oracle",20000,5.6));
		ts1.add(new Student(101,"praveen","Oracle",20000,5.6));
		ts1.add(new Student(104,"praveen","Oracle",20000,5.6));
		ts1.add(new Student(103,"praveen","Oracle",20000,5.6));
		ts1.add(new Student(107,"praveen","Oracle",20000,5.6));
		ts1.add(new Student(102,"praveen","Oracle",20000,5.6));
		ts1.add(new Student(109,"praveen","AJ",20000,5.6));
		ts1.add(new Student(103,"praveen","AJ",20000,5.6));
		ts1.add(new Student(105,"praveen","AJ",20000,5.6));
		ts1.add(new Student(104,"praveen","AJ",20000,5.6));
		System.out.println(ts1);
		
		TreeSet<Student> ts2=new TreeSet<Student>(new StudentRN());  
		ts2.add(new Student(101,"praveen","CJ",20000,5.6));
		ts2.add(new Student(102,"praveen","CJ",20000,5.6));
		ts2.add(new Student(101,"praveen","AJ",20000,5.6));
		ts2.add(new Student(101,"praveen","Oracle",20000,5.6));
		ts2.add(new Student(101,"praveen","Oracle",20000,5.6));
		ts2.add(new Student(104,"praveen","Oracle",20000,5.6));
		ts2.add(new Student(103,"praveen","Oracle",20000,5.6));
		ts2.add(new Student(107,"praveen","Oracle",20000,5.6));
		ts2.add(new Student(102,"praveen","Oracle",20000,5.6));
		ts2.add(new Student(109,"praveen","AJ",20000,5.6));
		ts2.add(new Student(103,"praveen","AJ",20000,5.6));
		ts2.add(new Student(105,"praveen","AJ",20000,5.6));
		ts2.add(new Student(104,"praveen","AJ",20000,5.6)); 
		System.out.println(ts2);
		
	}

}
