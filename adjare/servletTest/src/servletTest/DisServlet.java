package servletTest;
import java.io.*;
import javax.servlet.*;
public class DisServlet extends GenericServlet {
	public ServletContext sct;
	public ServletConfig cnf;
	
	@Override
	public void init()
			throws ServletException{
		sct=this.getServletContext();
		cnf=this.getServletConfig();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) 
			throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("name");
		int contextVal=Integer.parseInt(sct.getInitParameter("contextVal"));
		int configVal=Integer.parseInt(cnf.getInitParameter("configVal"));
		pw.println("welcome : "+name);
		
		pw.println("<br> servlet Name : "+cnf.getServletName());
		pw.println("<br> configValue : "+configVal);
		pw.println("<br> ServletInfo : "+sct.getServerInfo());
		pw.println("<br> contextVal : "+contextVal);
	}
}
