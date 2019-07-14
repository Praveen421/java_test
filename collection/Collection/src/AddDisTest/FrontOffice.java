package AddDisTest;
import java.util.*;
public class FrontOffice {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		DAO d=new DAO();
		while(true) {
			System.out.println("enter the job : ");
			String job=scn.nextLine();
			ArrayList emplist=d.getEmployee(job);
			System.out.println("empno      ename      ");
			for(int i=0;i<emplist.size();i++) {
				EmployeeBean bean=(EmployeeBean)emplist.get(i);
				System.out.println(bean.getEmpno()+" ");
			}
		}
	}
}