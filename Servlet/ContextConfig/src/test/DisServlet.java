package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DisServlet extends GenericServlet {
	public ServletContext sct;
	public ServletConfig cnf;
	@Override
	public void init()
	throws ServletException{
		cnf=this.getServletConfig();
		sct=this.getServletContext();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("name");
		int contextVal=Integer.parseInt(sct.getInitParameter("contextVal"));
		int configVal=Integer.parseInt(cnf.getInitParameter("configVal"));
		pw.println("welcome: "+name);
		pw.println("<br> ServletName : "+sct.getServletContextName());
		pw.println("<br> ConfigValue : "+configVal);
		pw.println("<br> ServerInfo  : "+sct.getServerInfo());
		pw.println("<br> ContextVal  : "+contextVal); 
	}
}