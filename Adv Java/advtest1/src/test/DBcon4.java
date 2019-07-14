package test;
import java.sql.*;
import java.util.*;
public class DBcon4 {

	public static void main(String[] args)
	throws ClassNotFoundException,SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Uname : ");
		String Uname = s.nextLine();
		System.out.println("enter the Pword : ");
		String Pword = s.nextLine();
		System.out.println("enter the fname : ");
		String fname = s.nextLine();
		System.out.println("enter the lname : ");
		String lname = s.nextLine();
		System.out.println("enter the address : ");
		String addr = s.nextLine();
		System.out.println("enter the Phno. : ");
		long Phno = Long.parseLong(s.nextLine());
		System.out.println("enter the mail id : ");
		String mId = s.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps = con.prepareStatement("insert into UserReg17 values(?,?,?,?,?,?,?)");
		ps.setString(1, Uname);
		ps.setString(2, Pword);
		ps.setString(3, fname);
		ps.setString(4, lname);
		ps.setString(5, addr);
		ps.setLong(6, Phno);
		ps.setString(7, mId);
		
		int k = ps.executeUpdate();
		if(k>0) {
			System.out.println("user Registered successfully..");
		}
		con.close();
		s.close();
	}

}
