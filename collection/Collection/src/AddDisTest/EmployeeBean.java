package AddDisTest;
import java.io.*;
public class EmployeeBean implements Serializable {
	private double empno;
	private String ename;
	private String job;
	private double mgr;
	private String hiredate;
	private double sal;
	private double comm;
	private int deptno;
	public double getEmpno() {
		return empno;
	}
	public void setEmpno(double empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getMgr() {
		return mgr;
	}
	public void setMgr(double mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}