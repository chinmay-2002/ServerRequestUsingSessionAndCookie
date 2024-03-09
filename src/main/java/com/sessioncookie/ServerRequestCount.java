package com.sessioncookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServerRequestCount using session
 */
@WebServlet(description = "This file contains code of seesion as well as cookies", urlPatterns = { "/ServerRequestCount" })
public class ServerRequestCount extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session=request.getSession();
//		int k=(Integer)session.getAttribute("requestCount");
//		PrintWriter out=response.getWriter();
//		out.println("<html><body>");
//		out.println("Total Server Visits Using Session is :" + k);
//		out.println("</body></html>");
		
		}
	}


