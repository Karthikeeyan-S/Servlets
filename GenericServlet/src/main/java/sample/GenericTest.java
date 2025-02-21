package sample;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
 
/**
* Servlet implementation class GenericServe
*/
public class GenericTest extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public int count,num1,num2;
	public void init(ServletConfig sc) 
	{
		count = Integer.parseInt(sc.getInitParameter("count"));
		num1 = Integer.parseInt(sc.getInitParameter("Number1"));
		num2 = Integer.parseInt(sc.getInitParameter("Number2"));
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<html>"+"<body>");
		pw.println("<h2>Value of Count : "+count+"</h2>");
		pw.println("<h2>Value of Number1 : "+num1+"</h2>");
		pw.println("<h2>Value of Number2 : "+num2+"</h2>");
	}
     public void destroy() {}  
    
}
