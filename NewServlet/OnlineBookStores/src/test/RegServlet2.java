package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet2 extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) 
			throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String addr=req.getParameter("Addr");
		Long phNo=Long.parseLong(req.getParameter("Phno"));
		String mId=req.getParameter("Mid");
		
		ServletContext sct=this.getServletContext();
		UserRegBean urb=(UserRegBean)sct.getAttribute("regBean");
		urb.setAddr(addr);
		urb.setPhNo(phNo);
		urb.setmId(mId);
		
		pw.println("    User Registration details are valid ....");
		pw.print("<a href='vdetails'> Click </a>"); 
		pw.println("to view details"); 
	}
}
