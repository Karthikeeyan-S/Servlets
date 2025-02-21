package login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Testing
 */
public class Testing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Predefined correct username and password
        String correctUsername = "admin";
        String correctPassword = "password123";
        
        // Check if entered values match the predefined ones
        if (correctUsername.equals(username) && correctPassword.equals(password)) {
            // Forward to WelcomeServlet
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome");
            dispatcher.forward(request, response);
        } else {
            // Forward back to login page (index.html)
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
            dispatcher.forward(request, response);
        }
    }

}
