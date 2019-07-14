package test;
import java.sql.*;
import java.util.*;
public class DBCon6 {
	public static void main(String[] args)
	throws SQLException,ClassNotFoundException{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Uname : ");
		String Uname=s.nextLine();
		System.out.println("enter the password");
		String Pword=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps1 = con.prepareStatement("select * from UserReg17 where Uname = ? and Pword = ?");
		ps1.setString(1,Uname);
		ps1.setString(2,Pword);
		ResultSet rs = ps1.executeQuery();
		if(rs.next()) {
			System.out.println("Welcome : "+rs.getString(3));
			System.out.println("your old phone no. is : "+rs.getLong(6));
			System.out.println("enter the new phone no. : ");
			Long Phno = Long.parseLong(s.nextLine());
			PreparedStatement ps2 = con.prepareStatement("update UserReg17 set PHNO = ? where UNAME = ? and PWORD = ?");
			ps2.setLong(1, Phno);
			ps2.setString(2, Uname);
			ps2.setString(3, Pword);
			int k = ps2.executeUpdate();
			if(k>0) {
				System.out.println("record update successfully....");
			}
			else {
				System.out.println("Sorry invalid Uname or Pword. ");
			}
			
		}
		else {
			System.out.println("Sorry invalid Uname or Pword. ");
		}
		con.close();
		s.close();
	}
}