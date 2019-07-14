package test;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
@SuppressWarnings("serial")
public class UpdateBooksServlet extends GenericServlet{ 
	public Connection con;

	@Override
	public void init() throws ServletException {con=DBConnection.getCon();}

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
				PrintWriter pw=res.getWriter();
				res.setContentType("text/html");
				BookBean bb=(BookBean)req.getAttribute("fName");
				ServletContext sct=this.getServletContext();           
				String fName=(String)sct.getAttribute("fName");        
				try {
					PreparedStatement ps=con.prepareStatement("insert into book17 values (?,?,?,?,?)");
					ps.setString(1, bb.getbCode());
					ps.setString(2, bb.getbName());
					ps.setString(3, bb.getbAuthor());
					ps.setInt(4, bb.getbPrice()); 
					ps.setInt(5, bb.getbQty()); 
					int k=ps.executeUpdate();
					if(k>0) {
						pw.println("welcome : "+fName+"<br>");
						RequestDispatcher rd=req.getRequestDispatcher("Link1.html");
						rd.include(req,res);
						pw.println("<br> ---------Book data Updated succesfully---------<br>");
					}
				}catch(Exception e) {}
	}
}
