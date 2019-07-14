package test;
import java.sql.*;
import java.util.*;
public class DBCon3 {
	public static void main(String[] args)throws SQLException , ClassNotFoundException {  
		Scanner s = new Scanner(System.in);
		System.out.println("enter the empno : ");
		String empno = s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");  //loading driver class
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		
		PreparedStatement ps = con.prepareStatement
				("select * from emp where empno=?");
		ps.setString(1,empno);
		
		//Statement stm = con.createStatement();
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
		    "\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+
			"\t"+rs.getInt(7));
		}
		else {
			System.out.println("invaid empno");
		}
		con.close();
		s.close();
	}
}
