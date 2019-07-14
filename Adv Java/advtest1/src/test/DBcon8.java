package test;
import java.sql.*;
import java.util.*;
public class DBcon8 {
	public static void main(String[] args) 
	throws ClassNotFoundException,SQLException{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Uname : ");
		String UName=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		PreparedStatement ps1=con.prepareStatement("select * from userreg17 where Uname = ?");
		ps1.setString(1,UName );
		ResultSet rs=ps1.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)
		    +"\t"+rs.getString(5)+"\t"+rs.getLong(6)+"\t"+rs.getString(7));
		}
		else {
			System.out.println("invalid User name ");
		}
	    /*while(rs.next()) {
	    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)
	    +"\t"+rs.getString(5)+"\t"+rs.getLong(6)+"\t"+rs.getString(7)); 
	    }*/
		con.close();
		s.close();
	}
}