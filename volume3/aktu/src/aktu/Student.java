package aktu;
import java.util.*;
@SuppressWarnings("unused")
public class Student implements Comparable<Student>{
	private int sno;
	private String sname,course;
	private double height;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "\n" + sno + ", " + sname + ", " + course + ", " + height + "";
	}
	@Override
	public int hashCode() {
		return Standard.getCvalue(course); 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return (this.course.equals(s.course)&&(this.sno==s.sno)); 
		}
		return false;
	}
	@Override
	public int compareTo(Student obj) {
		return 0; 
	}
	
}