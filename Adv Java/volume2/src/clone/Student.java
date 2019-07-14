package clone;
/*class Address implements Cloneable{
	int flatNo=1001;
	String colony="Ameerpet";
	String city="Hyd";
	
}
public class Student implements Cloneable {
	int sno=1;
	String sName="StudentOne";
	String course="Course 1";
	double fee=9000;
	Address add=new Address();

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student();
		Student s2=(Student)s1.clone();
		System.out.println(s1==s2);
		System.out.println(s1.add==s2.add);
	}

}
*/
class Address implements Cloneable{
	int flatNo=1001;
	String colony="Ameerpet";
	String city="Hyd";
	public Address clone()
	throws CloneNotSupportedException{
		return (Address)super.clone();
	}
	
}
public class Student implements Cloneable {
	int sno=1;
	String sName="StudentOne";
	String course="Course 1";
	double fee=9000;
	Address add=new Address();
	public Student clone()
	throws CloneNotSupportedException{
		Student s=(Student)super.clone();
		s.add=this.add.clone();
		return s;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student();
		Student s2=(Student)s1.clone();
		System.out.println(s1==s2);
		System.out.println(s1.add==s2.add);
	}

}