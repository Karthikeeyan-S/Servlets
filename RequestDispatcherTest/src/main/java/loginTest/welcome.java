package loginTest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
 
import java.io.*;
 
@WebServlet("/was")
public class welcome extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set content type to HTML
        response.setContentType("text/html");
        
        // Create a PrintWriter object to write the response
        PrintWriter out = response.getWriter();
        
        // Print the welcome message
        out.println("<html>");
        out.println("<head><title>Welcome</title></head>");
        out.println("<body>");
        out.println("<h2>Welcome, you are successfully logged in!</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}