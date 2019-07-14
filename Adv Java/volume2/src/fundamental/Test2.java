package fundamental;
class Student1{
	private int sno;
	private String sname;
	private String course;
	public Student1(int sno,String sname,String course) {
		this.sno=sno;
		this.sname=sname;
		this.course=course;
	}
	public String toString() {
		return ""+sno;
	}
	//Overriding
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else {
			if(obj instanceof Student1) {
				Student1 s=(Student1)obj;
				return (this.sno==s.sno)&&
						this.sname.equals(s.sname)&&
						this.course.equals(s.course);
			}
			else {
				return false;
			}
		}
	}
}
public class Test2 {
	public static void main(String[] args) {
		Student1 s1=new Student1(1,"hari krishna","core java");
		Student1 s2=new Student1(2,"vamsi krishna","oracle");
		Student1 s3=new Student1(3,"venkatesh","adv java");
		Student1 s4=new Student1(1,"hari krishna","core java");
		Student1 s5=s2;
		//System.out.println(s1==s2);
		//System.out.println(s1==s3);
		//System.out.println(s1==s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2==s5);
		System.out.println(s5.equals(s2));
		System.out.println(s1);
	}
}