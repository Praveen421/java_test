package test;
@SuppressWarnings("rawtypes")
public class Employee implements Comparable {
	private int eno;
	private String ename,dept;
	private double exp;
	public Employee(int eno, String ename, String dept, double exp) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
		this.exp = exp;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o; 
		double ed=this.exp-e.exp;
		if(ed==0) {
			return this.eno-e.eno;
		}else if(ed<0) {
			return -5;
		}else {
			return 5; 
		}
	}	
}