package AddDisTest;
import java.sql.*;
import java.util.*;
public class DAO {
	private Connection Con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123");
			String squery="select *  from emp where"+"where job=?";
			pstmt=Con.prepareStatement(squery);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//method for retrievieng information from DB
	public ArrayList getEmployee(String job) {
		ArrayList employeeList=new ArrayList();
		try {
			pstmt.setString(1,job );
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				bean.setEmpno(rs.getDouble(1));
				bean.setEname(rs.getString(2));
				bean.setJob(rs.getString(3));
				bean.setMgr(rs.getDouble(4));
				bean.setHiredate(rs.getString(5));
				bean.setSal(rs.getDouble(6));
				bean.setComm(rs.getDouble(7));
				bean.setDeptno(rs.getInt(8));
				employeeList.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return employeeList;
	}
	public void closeObjects() {
		try {
			if(pstmt!=null) {pstmt.close();}
			if(Con!=null) {Con.close();}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}