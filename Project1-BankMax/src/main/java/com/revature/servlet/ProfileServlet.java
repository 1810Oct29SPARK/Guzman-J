package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2625346607120644446L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Check whether as session exists for the incoming request
		HttpSession session = request.getSession(false);
		if (session != null) {
			request.getRequestDispatcher("Profile.html").forward(request, response);
		} else {
			response.sendRedirect("login");
		}
	}
}
