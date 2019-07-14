package University;
import UniversityHelper.*;
public class Student {
	private int sno;
	private String sname;
	private String course;
	private double fee;
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Student(int sno, String sname, String course, double fee) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}	
	@Override
	public int hashCode() {
		return Course.getCourseNUM(course);  
	}
	@Override
	public String toString() {
		return " [ " + sno + ", " + sname + ", " + course + ", " + fee + ", "
				+ getSno() + ", " + getSname() + ", " + getCourse() + ", " + getFee()
				+ "] "; 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return (this.course.equals(s) )&& (this.sno==sno); 
		}
		return false;
	}
	
}