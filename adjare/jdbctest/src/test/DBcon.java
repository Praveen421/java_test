package test;
import java.sql.*;
import java.util.*;
public class DBcon {
	public static void main(String[] args) 
	throws SQLException,ClassNotFoundException{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the User Name : ");
		String Uname=scn.nextLine();
		System.out.println("enter the Pword : ");
		String Pword=scn.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123");
		PreparedStatement ps=con.prepareStatement("select * from userreg17 where uname=? and pword=?");
		ps.setString(1, Uname);
		ps.setString(2, Pword);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("login successfull");
			System.out.println("welcome : "+rs.getString(3));
		}else {
			System.out.println("=========incorrect credentials =========");
		}
		con.close();
		scn.close();
	}
}