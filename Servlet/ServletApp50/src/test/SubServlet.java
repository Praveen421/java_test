package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class SubServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int a=Integer.parseInt(req.getParameter("op1"));
		int b=Integer.parseInt(req.getParameter("op2"));
		int c=a-b;
		pw.println("Subtraction : "+c+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);		
		
	}
}