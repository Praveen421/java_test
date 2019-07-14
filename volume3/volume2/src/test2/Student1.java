package test2;
public class Student1 implements Comparable {
	private int sno;
	private String sname,course;
	public Student1(int sno,String sname,String course) {
		this.sno=sno;
		this.sname=sname;
		this.course=course;
	}
	public int compareTo(Object obj) {  
		Student1 s=(Student1)obj;
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