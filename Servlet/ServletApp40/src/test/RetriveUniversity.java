package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RetriveUniversity extends GenericServlet {
	public Connection con;
	@Override
	public void init()
	throws ServletException{
		con=DBConnection.getCon(); 
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int code=Integer.parseInt(req.getParameter("Ccode"));
		try {
			
			PreparedStatement ps=con.prepareStatement("select * from university where ccode=?");
			ps.setInt(1, code);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				pw.println(rs.getInt(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+rs.getString(3)+"&nbsp&nbsp"+
						rs.getInt(4)+"&nbsp&nbsp"+rs.getString(5)+"&nbsp&nbsp"+rs.getString(6));
			}
			else {
				pw.println("invalid College code");
			}
		}
		catch(Exception e) {
			pw.println(e.getMessage());
		}
	}
}