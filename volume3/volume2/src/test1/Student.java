package test1;

public class Student implements Comparable{
	private int sno;
	private String sname,course;
	public Student(int sno,String sname,String course) {
		this.sno=sno;
		this.sname=sname;
		this.course=course;
	}
	public int compareTo(Object obj) {
		Student s=(Student)obj;
		int o=this.sno-s.sno;
		if(o==0) {
			return 0;
		}else if(o>0) {
			return 1;
		}else return -1;
	}
	public String toString() {
		return "\n"+this.sno+", "+this.sname+", "+this.course; 
	}
}