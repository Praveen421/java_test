package test;
import java.util.*;
import java.sql.*;
public class DBProTransaction {
	public static void main(String[] args)
	throws ClassNotFoundException,SQLException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Taccno : ");
		Long Taccno=Long.parseLong(s.nextLine());
		System.out.println("enter Faccno : ");
		Long Faccno=Long.parseLong(s.nextLine());
		System.out.println("enter amount to transfer : ");
		Float Amt=Float.parseFloat(s.nextLine());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");	
		CallableStatement c=con.prepareCall("call FundTransfer(?,?,?)");
		c.setLong(1, Faccno);
		c.setLong(2, Taccno);
		c.setFloat(3, Amt);
		c.executeUpdate();
		System.out.println("transaction complete...");
		con.close();
		s.close();
	}
}