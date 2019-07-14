package test;
import java.sql.*;
public class DBcon2 {
	public static void main(String[] args)
	throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from dept");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		con.close();
	}

}
