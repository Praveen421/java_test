package test;
import java.sql.*;
public class DBcon1{
public static void main(String[] args)throws SQLException , ClassNotFoundException {  
	Class.forName("oracle.jdbc.driver.OracleDriver");  //loading driver class
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
	
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery("select * from emp");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
	    "\t\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t\t\t"+"\t\t"+"\t\t"+rs.getInt(6)+"\t"+rs.getInt(7)+
		"\t"+rs.getInt(7));
	}
	con.close();
 }
}