package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Reimbursements;

@WebServlet("/reimbursement")
public class ReimbursementServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 200356704186349614L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("id") != null) {
			try {
			int id = Integer.parseInt(session.getAttribute("reimbursement_id").toString());
			double balance  = Double.parseDouble(session.getAttribute("balance").toString());
			String status = session.getAttribute("status").toString();
			int empId = Integer.parseInt(session.getAttribute("empId").toString());
			String description = session.getAttribute("description").toString();
			
			
			Reimbursements reimbs = new Reimbursements( id, balance, status, empId, description);
			response.getWriter().write((new ObjectMapper()).writeValueAsString(reimbs));
			} catch (Exception e ) {
				response.getWriter().write("{\"session\":null}");
			} 
		} else {
			response.getWriter().write("{\"session\":null}");
		}
	}
	
	

}
