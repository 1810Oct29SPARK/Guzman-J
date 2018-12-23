package com.revature.daos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Reimbursements;
import com.revature.util.ConnectionUtil;

public class ReimbursementDAOImpl implements ReimbursementDAO {

	private EmployeesDAO e = new EmployeesDAOImpl(); 
	private static final String filename = "connection.properties";
	
	@Override
	public List<Reimbursements> getReimbursements() {
		List<Reimbursements> rl = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT R.REIMBURSEMENT_ID, R.BALANCE, R.STATUS, R.EMPLOYEE_ID, R.DESCRIPTION";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int reimbId = rs.getInt("REIMBURSEMENT_ID");
				double balance = rs.getDouble("BALANCE");
				String status = rs.getString("STATUS");
				int empId = rs.getInt("EMPLOYEE_ID");
				String description = rs.getString("DESCRIPTION");
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return rl;
	}

	@Override
	public Reimbursements getReimbursementsById(int id) {
		Reimbursements r = null;
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT R.REIMBURSEMENT_ID, R.BALANCE, R.STATUS, R.EMPLOYEE_ID, R.DESCRIPTION ";
			PreparedStatement ptsmt = con.prepareStatement(sql);
			ptsmt.setInt(1, id);
			ResultSet rs = ptsmt.executeQuery();
			if(rs.next()) {
				int reimbId  = rs.getInt("REIMBURSEMENT_ID");
				double balance = rs.getDouble("BALANCE");
				String status  = rs.getString("STATUS");
				int empId = rs.getInt("EMPLOYEE_ID");
				String description  = rs.getString("DESCRIPTION");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public void insertReimbursement(int id, double balance, String status, int empId, String description) {
		try (Connection con = ConnectionUtil.getConnection(filename))
		{
			String sql = "INSERT INTO REIMBURSEMENTS VALUES (?????)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			p.setDouble(2, balance);
			p.setString(3, status);
			p.setInt(4, empId);
			p.setString(5, description);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateReimbursement(int id, double balance, String status, int empId, String description) {
		
		try (Connection con = ConnectionUtil.getConnection(filename))
		{
			String sql = "UPDATE REIMBURSEMENTS SET ID = ?, BALANCE = ?, STATUS = ?"
					+ "EMPLOYEE_ID = ?, DESCRIPTION = ?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			p.setDouble(2, balance);
			p.setString(3, status);
			p.setInt(4, empId);
			p.setString(5, description);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteReimbursement(int id, double balance, String status, int empId, String description) 
	{
		try (Connection con = ConnectionUtil.getConnection(filename))
		{
			String sql = "DELETE FROM REIMBURSEMENTS VALUES (?????)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			p.setDouble(2, balance);
			p.setString(3, status);
			p.setInt(4, empId);
			p.setString(5, description);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		
		}
	}
	
	public List<Reimbursements> getReimbursementsByEmpId(int empId){
		List<Reimbursements> list = new ArrayList<Reimbursements>();
		try(Connection con = ConnectionUtil.getConnection(filename)){
			String sql = "SELECT * FROM REIMBURSEMENTS WHERE EMPLOYEEID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int reimbId  = rs.getInt("REIMBURSEMENT_ID");
				double balance = rs.getDouble("BALANCE");
				String status = rs.getString("STATUS");
				int employeeId = rs.getInt("EMPLOYEE_ID");
				String descr = rs.getString("DESCRIPTION");
				list.add(new Reimbursements(reimbId, balance, status, employeeId, descr));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException f) {
			f.printStackTrace();
		}
		return list;
	}

}
