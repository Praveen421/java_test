package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
@SuppressWarnings("serial")
public class UserLoginServlet extends GenericServlet{
	Connection con;
	@Override
	public void init() throws ServletException {
		con=DBConnection.getCon();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("Uname");
		String pWord=req.getParameter("Pword");
		try {
			PreparedStatement ps=con.prepareStatement("select * from UserTab17 where uname=? and Pword=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				pw.println("welcome : "+rs.getString(3));
				ServletContext sct=req.getServletContext();
				sct.setAttribute("fName", rs.getString(3));
				RequestDispatcher rd=req.getRequestDispatcher("Link2.html");
				rd.include( req, res);
			}else {
				pw.print("invalid Username or password <br>");
				RequestDispatcher rd=req.getRequestDispatcher("UserLogin.html");
				rd.include(req, res); 
			}
		}catch(Exception e) {}
		
	}	
}