package com.sessioncookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieCounterServlet
 */
@WebServlet("/CookieCounterServlet")
public class CookieCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Cookie[] cookies = request.getCookies();
	        Integer count = 1;
	        if (cookies != null) {
	            for (Cookie cookie : cookies) {
	                if ("count".equals(cookie.getName())) {
	                    count = Integer.parseInt(cookie.getValue());
	                    count++;
	                    break;
	                }
	            }
	        }
	        Cookie cookie = new Cookie("count", String.valueOf(count));
	        cookie.setMaxAge(3600); // Cookie expires in 1 hour
	        response.addCookie(cookie);
	        response.sendRedirect("ServerReqCountCookie");
	}

}
