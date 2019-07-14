package test;
import java.util.*;
import java.sql.*;
public class DBprocall1 {
	public static void main(String[] args)
	throws SQLException,ClassNotFoundException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Uname");
		String UName=s.nextLine();
		System.out.println("enter Pword");
		String Pword=s.nextLine();
		System.out.println("enter Fname");
		String Fname=s.nextLine();
		System.out.println("enter Lname");
		String Lname=s.nextLine();
		System.out.println("enter Address");
		String Address=s.nextLine();
		System.out.println("enter Phno");
		long Phno=Long.parseLong(s.nextLine());
		System.out.println("enter Mailid");
		String Mail=s.nextLine();
		System.out.println("enter Accno.");
		long Accno=Long.parseLong(s.nextLine());
		System.out.println("enter Balance");
		float Bal=Float.parseFloat(s.nextLine());
		System.out.println("enter AccType");
		String AccType=s.nextLine();
		System.out.println("enter Custname");
		String CustName=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		CallableStatement cs=con.prepareCall("{call CreateAccount17(?,?,?,?,?,?,?,?,?,?,?)}");
		cs.setString(1, UName);
		cs.setString(2, Pword);
		cs.setString(3, Fname);
		cs.setString(4, Lname);
		cs.setString(5, Address);
		cs.setLong(6, Phno);
		cs.setString(7, Mail);
		cs.setLong(8, Accno);
		cs.setFloat(9, Bal);
		cs.setString(10, AccType);
		cs.setString(11, CustName);
		cs.execute();
		System.out.println("procedure executed successfully...");
		con.close();
		s.close();
	}
}