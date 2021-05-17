package web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Go")

public class ScopeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	String VUE = "/Test.jsp";
	 
	ServletContext application = null;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String passwd = request.getParameter("passwd");
		
		if (login.equalsIgnoreCase("admin") && passwd.equalsIgnoreCase("0000") ) {
			
			String Msg = "Welcome Admin";
			request.setAttribute("Msg", Msg);
			

			
		}else  {
			
		
			RequestDispatcher Envoloppe = request.getRequestDispatcher("Login.jsp");
			Envoloppe.forward(request, response);
		}
		RequestDispatcher Envoloppe = request.getRequestDispatcher(VUE);
		Envoloppe.forward(request, response);
	}

}
