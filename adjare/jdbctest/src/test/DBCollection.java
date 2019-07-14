package test;
import java.util.*;
import java.sql.*;
public class DBCollection {
	public static void main(String[] args) 
	throws SQLException,ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123");
		ArrayList<Product> al=new ArrayList<Product>();
		PreparedStatement ps=con.prepareStatement("select * from product17");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Product p1=new Product();
			p1.setPcode(rs.getInt(1));
			p1.setPname(rs.getString(2));
			p1.setPprice(rs.getInt(3));
			p1.setPqty(rs.getInt(4));
			al.add(p1);
		}
		System.out.println("===display from JCF object (Iterator<E>===)");
		Iterator<Product> it=al.iterator();
		while(it.hasNext()) {
			Product k=it.next();
			System.out.println(k.getPcode()+" "+k.getPname()+" "+k.getPprice()+" "+k.getPqty());
		}
		System.out.println("===display from JCF object foreach() ===");
		al.forEach((z)->{
			Product p=(Product)z;
			System.out.println(p.getPcode()+" "+p.getPname()+" "+p.getPprice()+" "+p.getPqty());
		});
	}
}