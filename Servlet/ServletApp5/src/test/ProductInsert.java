package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class ProductInsert extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res) 
			throws ServletException,IOException{
				PrintWriter pw=res.getWriter();
				res.setContentType("text/html");
		int Pcode=Integer.parseInt(req.getParameter("pcode"));
		String Pname=req.getParameter("pname");
		int Pprice=Integer.parseInt(req.getParameter("pprice"));
		int Pqty=Integer.parseInt(req.getParameter("pqty"));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
			PreparedStatement ps=con.prepareStatement("insert into product17 values(?,?,?,?)");
			ps.setInt(1, Pcode);
			ps.setString(2, Pname);  
			ps.setInt(3, Pprice);
			ps.setInt(4, Pqty);
			int k=ps.executeUpdate();
			if(k>0) {
				pw.print("product data updated...");
			}
			else {
				pw.print("invalid entry..."); 
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}