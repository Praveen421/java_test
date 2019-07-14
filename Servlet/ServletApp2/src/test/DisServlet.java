package test;
import java.io.*;
import javax.servlet.*;
public class DisServlet extends GenericServlet {
	@Override
	public void init() throws ServletException{
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	
	PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String UName=req.getParameter("Uname");
		String Fname=req.getParameter("Fname");
		String Phno=req.getParameter("PhNo");
		String Mid=req.getParameter("Mid");
		
		pw.println("--------User Details-------");
		pw.println("<br>FullName :"+Fname);
		pw.println("<br>Phone no. :"+Phno);
		pw.println("<br>MailId :"+Mid);
	}
	@Override
	public void destroy() {
		
	}
}