package test;
import java.sql.*;
import java.util.*;
public class DBcon12 {
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
			System.out.println("welecome "+rs.getString(3));
			System.out.println("your old phone no. is : "+rs.getLong(6));
			System.out.print("new phone no. :");
			Long Phno=Long.parseLong(s.nextLine());
			PreparedStatement ps2=con.prepareStatement("update userreg17 set PHNO = ? where UNAME = ?");
			ps2.setLong(1, Phno);
			ps2.setString(2, Uname);
			int k=ps2.executeUpdate();
			if(k>0) {
				System.out.println("updation complete.....");
				PreparedStatement ps3=con.prepareStatement("select * from userreg17 where Uname=? and Pword=?");
				ps3.setString(1, Uname);
				ps3.setString(2, Pass);
				ResultSet rs1=ps3.executeQuery();
				if(rs1.next()) {
					System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+
					"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(7)+"\t"+rs1.getLong(6));
				}
				else {
					System.out.println("sorry");
				}
			}
			else {
				System.out.println("something went wrong");
			}
		}
		else {
			System.out.println("invalid credentials");
		}
		con.close();
		s.close();
	}
}