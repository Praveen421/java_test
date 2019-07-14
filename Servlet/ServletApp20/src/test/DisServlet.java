package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DisServlet extends GenericServlet {
	public void init()
	throws ServletException{
		
	}
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("Uname");
		String fName=req.getParameter("Fname");
		String lName=req.getParameter("Lname");
		Long phno=Long.parseLong(req.getParameter("Phno"));
		String girlfriend=req.getParameter("Gf");
		
		pw.println("--------------------details------------------");
		pw.println("<br>User name  : "+uName);
		pw.println("<br>First name : "+fName);
		pw.println("<br>Last name  : "+lName);
		pw.println("<br>Phone no.  : "+phno);
		pw.println("<br>his girlfriend is "+girlfriend);
	}
	public void destroy() {
		
	}
}