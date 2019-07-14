package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class ViewDetailsServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) 
			throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ServletContext sct=this.getServletContext();
		UserRegBean urb=(UserRegBean)sct.getAttribute("regBean");
		
		pw.println("User name : "+urb.getuName());
		pw.println("<br> Name : "+urb.getfName()+urb.getlName());
		pw.println("<br> Addr : "+urb.getAddr());
		pw.println("<br> Phone: "+urb.getPhNo());
		pw.println("<br> Mail : "+urb.getmId());
		pw.println("<br>");
		pw.println("<form action = 'reg' method = 'post'>");
		pw.println("<input type ='submit' value = 'Register'>"); 
		pw.println("</form>"); 
	} 
}
