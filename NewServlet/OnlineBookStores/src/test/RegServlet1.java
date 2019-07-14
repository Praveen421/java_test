package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet1 extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		
		res.setContentType("text/html");
		String uName=req.getParameter("Uname");
		String pWord=req.getParameter("Pword");
		String fName=req.getParameter("Fname");
		String lName=req.getParameter("Lname");
		
		UserRegBean urb=new UserRegBean();
		urb.setuName(uName);
		urb.setpWord(pWord);
		urb.setfName(fName);
		urb.setlName(lName);
		
		ServletContext sct=this.getServletContext();
		sct.setAttribute("regBean", urb);
		RequestDispatcher rd=req.getRequestDispatcher("Register2.html");
		rd.forward(req, res);
	}
}
