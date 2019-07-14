package LIT;
public class Student implements Comparable{
	int rollnum;
	private String sname;
	private String course;
	private double fee,height;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Student(int rollnum, String sname, String course, double fee, double height) {
		super();
		this.rollnum = rollnum;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
		this.height = height;
	}
	@Override
	public String toString() {
		return "\n" + rollnum +"\t "+ sname +"\t "+ course +"\t"+ fee +"\t" + height;  
	}
	@Override
	public int compareTo(Object o) {
		Student s1=(Student)o;
		int foCourseNum=Course.getCourseNum(this.course);
		int soCourseNum=Course.getCourseNum(s1.course);
		int coursediff=foCourseNum-soCourseNum;
		if(coursediff!=0) {
			return coursediff;
		}else {
			return this.rollnum-s1.rollnum; 
		}
	}
	
}