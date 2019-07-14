package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RetriveServlet extends GenericServlet {
	public Connection con;
	@Override
	public void init() throws ServletException{
		con=DBConnection.getCon();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String cId=req.getParameter("cid");
		try {			
             PreparedStatement ps=con.prepareStatement("select * from course17 where cid=?");
			
			ps.setString(1, cId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				pw.println(rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+rs.getString(4));
			}
			else {
				pw.println("invalid courseID");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}