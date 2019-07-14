package companyData;
import java.sql.*;
public class corporate {
	
	public static void main(String[] args) 
	throws SQLException,ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from company");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getLong(3)+"\t"+rs.getString(4)
			+"\t"+rs.getString(5));
		}
		PreparedStatement ps=con.prepareStatement("select * from company where cs_id =?");
		ps.setInt(1,1000 );
		ResultSet rs1=ps.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+"  "+rs1.getLong(3)+"\t"+rs1.getString(4)
			+"\t"+rs1.getString(5));
		}
		con.close();
	}
}