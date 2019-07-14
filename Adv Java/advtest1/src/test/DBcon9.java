package test;
import java.sql.*;
import java.util.*;
public class DBcon9 {
	public static void main(String[] args)
			throws ClassNotFoundException,SQLException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Uname : ");
		String UName=s.nextLine();
		System.out.println("enter the Password : ");
		String Pass=s.nextLine();
		System.out.println("enter the Fname : ");
		String FirstName=s.nextLine();
		System.out.println("enter the Lname : ");
		String LastName=s.nextLine();
		System.out.println("enter the Address : ");
		String Address=s.nextLine();
		System.out.println("enter the Phno. : ");
		String Phone=s.nextLine();
		System.out.println("enter the Mail id : ");
		String Mail=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps2 = con.prepareStatement("insert into userreg17 values (?,?,?,?,?,?,?)");
		ps2.setString(1, UName);
		ps2.setString(2, Pass);
		ps2.setString(3, FirstName);
		ps2.setString(4, LastName);
		ps2.setString(5, Address);
		ps2.setString(6, Phone);
		ps2.setString(7, Mail);
		int k=ps2.executeUpdate();
		if(k>0) {
			System.out.println("data added succesfully......");
		}
		else {
			System.out.println("something went wrong......");
		}
		con.close();
		s.close();
	}
}