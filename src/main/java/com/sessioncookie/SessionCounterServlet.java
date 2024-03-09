package com.sessioncookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionCounterServlet")
public class SessionCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
	        
	        // Retrieve the session attribute "requestCount" or initialize it to 0 if it doesn't exist
	        Integer sessionCount = (Integer) session.getAttribute("requestCount");
	        if (sessionCount == null) {
	            sessionCount = 0;
	        }
	        
	        // Increment the session attribute "requestCount"
	        sessionCount++;
	        session.setAttribute("requestCount", sessionCount);
//	        response.sendRedirect("ServerRequestCount");
	        
	        
	        
	        
	        PrintWriter out=response.getWriter();
			out.println("<html><body bgcolor='lightcoral'>");
			out.println("<center><h1>Total Server Visits Using Session is :" + (int)sessionCount + "</center></h1>" );
			out.println("<br/>Session ID : " + session.getId());
			out.println("<br/>Session in Strings: " + session.toString());
			out.println("<br/>Session Servlet Context : " + session.getServletContext());
			out.println("<br/>Session Max Inactive Interval : " + session.getMaxInactiveInterval());
			
			
			out.println("</body></html>");

	}



}
