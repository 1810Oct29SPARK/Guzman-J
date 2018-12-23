package com.revature.daos;

import java.io.File;
import java.util.List;

import com.revature.beans.Reimbursements;

public interface ReimbursementDAO {
		
	public List<Reimbursements> getReimbursements();
	public Reimbursements getReimbursementsById(int id);
	public void insertReimbursement(int id, double balance, String status, int empId, String description);
	public void updateReimbursement(int id, double balance, String status, int empId, String description);
	public void deleteReimbursement(int id, double balance, String status, int empId, String description);
	public List<Reimbursements> getReimbursementsByEmpId (int empId);
}
