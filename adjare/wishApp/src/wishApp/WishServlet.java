package wishApp;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class WishServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException{
		PrintWriter pw=null;
		Calendar calendar=null;
		int hour=0;
		
		pw=res.getWriter();
		res.setContentType("text/html");
		
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<=12) {
			pw.println("<h1 style='color:red'><center>Good Morning</center></h1>");		
		}else if(hour<=17){
			pw.println("<h1 style='color:red'><center>Good AfterNoon</center></h1>");
			
		}else pw.println("<h1 style='color:red'><center>Good Night</center></h1>");
		pw.println("<br><a href='http://localhost:8081/wishapp/page.html'>home</a>");
		pw.close();
	}
}
