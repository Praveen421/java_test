package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AddBookServlet extends GenericServlet{
	public Connection con;
	@Override
	public void init()
	throws ServletException{
		con=DBConnection.getCon();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) 
	throws ServletException,IOException{
		
		res.setContentType("text/html");
		String bCode=req.getParameter("Bcode");
		String bName=req.getParameter("Bname");
		String bAuthor=req.getParameter("Bauthor");
		int bPrice=Integer.parseInt(req.getParameter("Bprice"));
		int bQty=Integer.parseInt(req.getParameter("Bqty"));
		BookBean bb=new BookBean(bCode, bName, bAuthor, bPrice, bQty);
		req.setAttribute("bean", bb);
		RequestDispatcher rd=req.getRequestDispatcher("updates"); 
		rd.forward(req,res);
	}
}
