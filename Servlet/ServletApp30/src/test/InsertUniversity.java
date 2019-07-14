package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class InsertUniversity extends GenericServlet {
	@Override
	public void init()
	throws ServletException{}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int Ccode=Integer.parseInt(req.getParameter("ccode"));
		String Cname=req.getParameter("cname");
		String Sname=req.getParameter("sname");
		int Scode=Integer.parseInt(req.getParameter("scode"));
		String Pname=req.getParameter("pname");
		String Sub=req.getParameter("sub");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"
					+ "orcl","scott","123");
			PreparedStatement ps=con.prepareStatement("insert into university values (?,?,?,?,?,?)");
			ps.setInt(1, Ccode);
			ps.setString(2, Cname);
			ps.setString(3, Sname);
			ps.setInt(4, Scode);
			ps.setString(5, Pname);
			ps.setString(6, Sub);
			
			int k=ps.executeUpdate();
			if(k>0) {
				pw.println("table updated ..... ");
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			System.out.println("exception rised is DataBase Connection");
		}
	}
} 