package fundamental;
class Student0{
	private int sno;
	private String sname;
	private String course;
	public Student0(int sno,String sname,String course) {
		this.sno=sno;
		this.sname=sname;
		this.course=course;
	}
	@Override
	public int hashCode() {
		return sno;
	}
	
}
public class Test0 {
	public static void main(String[] args) {
		Student0 s1=new Student0(123,"hari","core java");
		Student0 s2=new Student0(124,"vamsi krishna","oracle");
		System.out.println("hash code s1: "+s1.hashCode());
		System.out.println("hash code s2: "+s2.hashCode());
	}
}