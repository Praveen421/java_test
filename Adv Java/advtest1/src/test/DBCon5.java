package test;
import java.sql.*;
import java.util.*;
public class DBCon5 
 {
	public static void main(String[] args)
	throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the user name : ");
		String Uname=s.nextLine();
		System.out.println("enter the password : ");
		String Pword = s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps = con.prepareStatement("select * from Userreg17 where Uname = ? and Pword = ?");
		ps.setString(1, Uname);
		ps.setString(2, Pword);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("Login successfull");
			System.out.println("welcome "+rs.getString(3)+" "+rs.getString(4));
		}
		else {
			System.out.println("Invalid username or password");
		}
		con.close();
		s.close();
	}

}
