package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employees;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6035723100739982453L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if (session != null) {
			try {
			int id = Integer.parseInt(session.getAttribute("employee_id").toString());
			String firstName = session.getAttribute("firstname").toString();
			String lastName =session.getAttribute("lastname").toString();
			String position = session.getAttribute("position").toString();
			boolean isManagement = Boolean.valueOf(String.valueOf(session.getAttribute("management")));
			
			Employees emp = new Employees( id, firstName, lastName, null, position, isManagement, null);
			System.out.println(emp);
			response.getWriter().write((new ObjectMapper()).writeValueAsString(emp));
			} catch (Exception e ) {
				response.getWriter().write("{\"session\":null}");
			} 
		}
		else {
			response.getWriter().write("{\"session\":null}");
		}
	}
}
