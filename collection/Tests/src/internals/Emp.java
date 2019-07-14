package internals;
public class Emp {
	int eno;
	String ename;
	double sal;
	String dept;
	public Emp(int eno, String ename, double sal, String dept) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}
	/*@Override
	public boolean equals(Object o) {
		if(o instanceof Emp) {
			Emp e=(Emp)o;
			return(this.eno==eno);
		}
		return false;
	}*/
	@Override
	public String toString() {
		return "[eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]";
	}
}