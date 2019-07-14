package test;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
@SuppressWarnings("serial")
public class ViewBookServlet2 extends GenericServlet{
	public Connection con;
	@Override
	public void destroy() {} 

	@Override
	public void init() throws ServletException {con=DBConnection.getCon();}

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
				PrintWriter pw=res.getWriter();
				res.setContentType("text/html");
				ServletContext sct=this.getServletContext();
				String fName=(String)sct.getAttribute("fName");
				try {
					PreparedStatement ps=con.prepareStatement("select * from book17");
					ResultSet rs=ps.executeQuery();
					 
					RequestDispatcher rd=req.getRequestDispatcher("Link2.html");
					rd.include(req, res);
					pw.println("welcome : "+fName+"<br>"); 
					pw.println("<br> -----BOOKS details-----");
					while(rs.next()) {
						pw.println("<br>"+rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+
					rs.getString(3)+"&nbsp&nbsp"+rs.getInt(4)+"&nbsp&nbsp"+rs.getInt(5));
					}
				}catch(Exception e) {} 
	}
}
