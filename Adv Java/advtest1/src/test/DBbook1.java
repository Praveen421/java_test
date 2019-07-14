package test;
import java.sql.*;
import java.util.*;
public class DBbook1 {
	public static void main(String[] args)
	throws ClassNotFoundException,SQLException{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the author name : ");
		String Bauthor = s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps = con.prepareStatement("select * from book17 where Bauthor = ?");
		ps.setString(1,Bauthor);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("congratulation book available");
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
		}
		else {
			System.out.println("sorry...");
		}
		con.close();
		s.close();
	}
}
