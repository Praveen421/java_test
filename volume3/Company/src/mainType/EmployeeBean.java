package mainType;
import subType.Dept;
public class EmployeeBean {
	private int eno;
	private String ename,dname,job;
	private double sal;
/*	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	*/
	public EmployeeBean(int eno, String ename, String dname, String job, double sal) {
		//super();
		this.eno = eno;
		this.ename = ename;
		this.dname = dname;
		this.job = job;
		this.sal = sal;
	} 
	@Override
	public String toString() {
		return "\n " + eno + ", " + ename + ", " + dname + ", " + job + ", " + sal; 
		
	}
	@Override
	public int hashCode() {		
		return Dept.getDeptNum(dname); 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EmployeeBean) {
			EmployeeBean e=(EmployeeBean)obj;
			return (this.dname.equals(e.dname))&&(this.eno==e.eno); 
		}
		return false; 
	}
	

}