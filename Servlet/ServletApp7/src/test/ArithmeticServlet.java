package test;
import java.io.*;
import javax.servlet.*;
public class ArithmeticServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String submit=req.getParameter("submit");
		if(submit.equals("Add")) {
			RequestDispatcher rd=req.getRequestDispatcher("add");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
	}
}