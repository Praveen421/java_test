package test;
import java.sql.*;
import java.util.*;
public class DBcon10 {
	public static void main(String[] args)
	throws SQLException,ClassNotFoundException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the user name: ");
		String Uname=s.nextLine();
		System.out.println("enter the Password: ");
		String Pass=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps=con.prepareStatement("select * from userreg17 where Uname=? and Pword=?");
		ps.setString(1, Uname);
		ps.setString(2, Pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("welcome "+rs.getString(3)+rs.getString(4));
			System.out.println();
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+
			rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(7)+"\t"+rs.getLong(6));
		}
		else {
			System.out.println("invalid user name or password");
		}
		con.close();
		s.close();
	}
}