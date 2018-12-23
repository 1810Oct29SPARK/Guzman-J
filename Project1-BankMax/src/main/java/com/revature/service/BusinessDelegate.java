package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employees;
import com.revature.beans.Reimbursements;
import com.revature.daos.EmployeesDAO;
import com.revature.daos.EmployeesDAOImpl;
import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementDAOImpl;

public class BusinessDelegate {
	
	private EmployeesDAO ed = new EmployeesDAOImpl();
	private ReimbursementDAO rd = new ReimbursementDAOImpl();

		public List<Employees> getEmployees() {
			
			 List<Employees> employees = new ArrayList<>();
			employees = ed.getEmployees();
			return employees;
			
		}
		
		public Employees getEmployeeById(int id) {
			
			Employees e = ed.getEmployeeById(id);
			return e;
			
		}
		
		public void inserReimbursement(int id, double balance, String status, int empId, String desc) {
			rd.insertReimbursement(id, balance, status, empId, desc);
			
		}
		public void updateReimbursement(int id, double balance, String status, int empId, String desc) {
			rd.updateReimbursement(id, balance, status, empId, desc);
			
		}
		public void deleteReimbursement(int id, double balance, String status, int empId, String desc) {
			rd.deleteReimbursement(id, balance, status, empId, desc);
			
		}
		public List<Reimbursements> getReimbursements(){
			List<Reimbursements> reimbs = rd.getReimbursements();
			return reimbs;
			
		}
		public Reimbursements getReimbursementById(int id) {
			Reimbursements r = rd.getReimbursementsById(id);
			return r;
			
		}
		public List<Reimbursements> getReimbursementsByEmpId(int empId){
			
			List<Reimbursements> reimbs = rd.getReimbursementsByEmpId(empId);
			return reimbs;
		}
		
		public Employees authenticateEmployees(String username, String password) {
		
		Employees e = ed.authenticateEmployees(username, password);
		return e;
		
	}

}
