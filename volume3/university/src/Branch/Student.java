package Branch;
import university.College;
public class Student {
	private int sno;
	private String sname,standard;
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Student(int sno, String sname, String standard, double fee) {
		//super();
		this.sno = sno;
		this.sname = sname;
		this.standard = standard;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "\n " + sno + ", " + sname + ", " + standard + ", " + fee + ""; 
	}
		
	@Override 
	public int hashCode() {
			return College.getCourseNum(standard);  
		}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return (this.standard.equals(s.standard)) &&(this.sno==s.sno);  
		}
		return false;
	}
	
}