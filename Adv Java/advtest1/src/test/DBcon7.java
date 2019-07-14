package test;
import java.sql.*;
public class DBcon7 {
	public static void main(String[] args)
	throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		Statement stm=con.createStatement();
	    ResultSet rs=stm.executeQuery("select * from userreg17");
	    while(rs.next()) {
	    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)
	    +"\t"+rs.getString(5)+"\t"+rs.getLong(6)+"\t"+rs.getString(7)); 
	    }
	    con.close();
	}
}