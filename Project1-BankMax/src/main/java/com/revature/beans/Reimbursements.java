package com.revature.beans;

public class Reimbursements {
	
	public Reimbursements(int id, double balance, String status, int empId, String description) {
		super();
		this.id = id;
		this.balance = balance;
		this.status = status;
		this.empId = empId;
		this.description = description;
	}
	
	public Reimbursements()
	{
		
	}
	
	private int id;
	private double balance;
	private String status;
	private int empId;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Reimbursements [id=" + id + ", balance=" + balance + ", status=" + status + ", empId=" + empId + ", description=" + description + "]";
	}

}
