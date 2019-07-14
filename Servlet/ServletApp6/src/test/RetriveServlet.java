package test;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RetriveServlet extends GenericServlet {
	public Connection con;
	@Override
	public void init() throws ServletException{
		con=DBconnection.getCon();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int Pcode=Integer.parseInt(req.getParameter("pcode"));
		try {
			PreparedStatement ps=con.prepareStatement("select * from product17 where pcode=?");
			ps.setInt(1, Pcode);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				pw.println(rs.getInt(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+rs.getInt(3)+
						"&nbsp&nbsp"+rs.getInt(4));
			
			}
			else {
				pw.println("invalid entry....");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
