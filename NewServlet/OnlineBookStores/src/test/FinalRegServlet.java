package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
@SuppressWarnings("serial")
public class FinalRegServlet extends GenericServlet{
	Connection con;
	@Override
	public void init() 
			throws ServletException {
		con=DBConnection.getCon();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)  
			throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ServletContext sct=req.getServletContext();
		UserRegBean urb=(UserRegBean)sct.getAttribute("regBean"); 
		try {
			PreparedStatement ps=con.prepareStatement("insert into UserTab17 values (?,?,?,?,?,?,?)");
			ps.setString(1, urb.getuName());
			ps.setString(2, urb.getpWord());
			ps.setString(3, urb.getfName());
			ps.setString(4, urb.getlName());
			ps.setString(5, urb.getAddr());
			ps.setLong(6, urb.getPhNo());
			ps.setString(7, urb.getmId()); 
			int k=ps.executeUpdate();
			if(k>0) {
				
				RequestDispatcher rd=req.getRequestDispatcher("UserLogin.html");
				pw.println("-----User Registration succesfull-----<br>");
				rd.include(req, res);
			}
		}catch(Exception e) {}
	}
}
