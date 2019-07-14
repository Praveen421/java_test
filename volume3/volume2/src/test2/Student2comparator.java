package test2;

public class Student2comparator implements java.util.Comparator<Student1>{
	@Override
	public int compare(Student1 o1, Student1 o2) {	  	
		Student1 s1=(Student1)o1;
		Student1 s2=(Student1)o1;
		return s1.compareTo(s2); 
	}
}