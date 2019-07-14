package test;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends GenericServlet{
	public void init()
	throws javax.servlet.ServletException{
		
	}
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("second first program praveen");
	}
	public void destroy() {
		
	}
}