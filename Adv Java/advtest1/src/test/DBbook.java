package test;
import java.sql.*;
public class DBbook {
	public static void main(String[] args) 
	throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from Book17");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t\t"+rs.getInt(3)+"\t"+rs.getInt(4));
		}
		con.close();
	}
}