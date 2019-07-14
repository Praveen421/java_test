package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class ArithmeticServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		
		res.setContentType("text/html");
		String operation=req.getParameter("submit");
		if(operation.equals("Add")) {
			RequestDispatcher rd=req.getRequestDispatcher("add"); 
			rd.forward(req, res);
		}
		else if(operation.equals("Sub")){
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
		else if(operation.equals("Div")) {
			RequestDispatcher rd=req.getRequestDispatcher("div");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("mul");
			rd.forward(req, res);
		}
	}
} 