package com.sessioncookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerReqCountCookie
 */
@WebServlet("/ServerReqCountCookie")
public class ServerReqCountCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int k=0;
		Cookie cookies[]= request.getCookies();
		Cookie d = null;
		for(Cookie c: cookies)
		{
		if(c.getName().equals("count"))
		{
			d = c;
		k = Integer.parseInt(c.getValue());
		}
		}
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='lightgray'>");
		out.println("<center><h1>Server Request Count Using Cookie is :" + k + "</center></h1>");
		out.println("<br/><b>Cookie Name : " + d.getName());
		out.println("<br/>Cookie Domain : " + d.getDomain());
		out.println("<br/>Cookie Max AGE : " + d.getMaxAge());
		out.println("<br/>Cookie Version : " + d.getVersion());
		out.println("<br/>Cookie in Strings : " + d.toString());
		out.println("<br/>Cookie Path : " + d.getPath());
		out.println("<br/>IS our cookie HTTP Only : " + d.isHttpOnly() + "</b>	");
		
		out.println("</body></html>");
	}

}
