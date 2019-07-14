package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*; 
public class InsertServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String cID=req.getParameter("cid");
		String cName=req.getParameter("cname");
		String tName=req.getParameter("tname");
		int duration=Integer.parseInt(req.getParameter("duration"));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
			PreparedStatement ps=con.prepareStatement("insert into Course17 values (?,?,?,?)");
			ps.setString(1, cID);
			ps.setString(2, cName);
			ps.setString(3, tName);
			ps.setInt(4, duration);
			int k=ps.executeUpdate();
			if(k>0)
			{
				pw.println("course updated successfully....");
			}
			con.close();
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}