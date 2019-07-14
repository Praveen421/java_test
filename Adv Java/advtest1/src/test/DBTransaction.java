package test;
import java.util.*;
import java.sql.*;
public class DBTransaction {
	public static void main(String[] args)
	throws ClassNotFoundException,SQLException{
		Scanner s=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123");
		PreparedStatement ps=con.prepareStatement("update Bank17 set BALANCE=BALANCE+? where ACCNO=?");
		PreparedStatement ps1=con.prepareStatement("select * from bank17 where ACCNO=?");
		con.setAutoCommit(false);
		Savepoint s1=con.setSavepoint();
		System.out.println("enter  Faccno  : ");
		long Faccno=Long.parseLong(s.nextLine());
		ps1.setLong(1, Faccno);
		ResultSet rs1=ps1.executeQuery();
		if(rs1.next()) {
			float Fbal=rs1.getFloat(3);
			System.out.println("enter the amount to transfer : ");
			float Amt=Float.parseFloat(s.nextLine());
			if(Amt<Fbal) {
				System.out.println("enter Taccno : ");
				long Taccno=Long.parseLong(s.nextLine());
				ResultSet rs2=ps1.executeQuery();
				if(rs2.next()) {
				ps.setFloat(1, -Amt);
				ps.setLong(2, Faccno);
				int i=ps.executeUpdate();
				ps.setFloat(1, Amt);
				ps.setLong(2, Taccno);
				int j=ps.executeUpdate();
				if(i==1&&j==1) {
					System.out.println("transaction completed....");
					con.commit();
				}
				else {
					System.out.println("transaction failed...");
					con.rollback(s1);
				}
				}
				else {
					System.out.println("invalid Taccno...");
				}
			}
			else {
				System.out.println("insufficient fund...");
			}
			
		}else {
			System.out.println("invalid Faccno...");
		}
	con.close();
	s.close();
	}
}