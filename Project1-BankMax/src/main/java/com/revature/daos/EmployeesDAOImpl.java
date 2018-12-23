package com.revature.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employees;
import com.revature.util.ConnectionUtil;

public class EmployeesDAOImpl implements EmployeesDAO {

	private static final String AUTHENTICATE = "SELECT * FROM EMPLOYEE WHERE USERNAME=? and PASSWORD=?";
	private static final String FIND_ALL = "SELECT * FROM EMPLOYEE ORDER BY EMPLOYEE_ID";
	private static final String filename = "connection.properties";
	
	
	@Override
	public List<Employees> getEmployees() {
		
		List<Employees> empl = new ArrayList<>();
		
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(FIND_ALL);
 
            Employees employee = null;
 
            while (resultSet.next()) {
                employee = new Employees();
 
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("firstName"));
                employee.setLastName(resultSet.getString("lastName"));
                employee.setUsername(resultSet.getString("username"));
                employee.setPosition(resultSet.getString("position"));
                employee.setPassword(resultSet.getString("password"));
                System.out.println(employee.toString());
 
                empl.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empl;
	}

	@Override
	public Employees getEmployeeById(int id) {
		
		Employees emp = null;

		try (Connection con = ConnectionUtil.getConnection(filename)) {
			// write a join which unifies Bear, Cave, and BearType into a ResultSet
			// map the ResultSet's entry onto a Bear
			String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery(); //if we are changing anything, use executeUpdate()
			if(rs.next()) {
				int empId  = rs.getInt("EMPLOYEE_ID");
				String firstname = rs.getString("FIRSTNAME");
				String lastname  = rs.getString("LASTNAME");
				String username = rs.getString("USERNAME");
				String position = rs.getString("POSITION");
				boolean management  = rs.getBoolean("MANAGEMENT");
				String password = rs.getString("PASSWORD");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public void insertEmployee(int id, String firstName, String lastName, String username, String position,
			boolean management, String password) {
		try (Connection con = ConnectionUtil.getConnection(filename))
		{
			String sql = "INSERT INTO REIMBURSEMENTS VALUES (???????)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			p.setString(2, firstName);
			p.setString(3, lastName);
			p.setString(4, username);
			p.setString(5, position);
			p.setBoolean(6, management);
			p.setString(7, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Employees authenticateEmployees(String username, String password) 
	{
		Employees emp = null;
		
		try (Connection con = ConnectionUtil.getConnection(filename))
		{
			String sql = "SELECT * FROM EMPLOYEE WHERE USERNAME=? AND PASSWORD=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("EMPLOYEE_ID");
				String firstName = rs.getString("FIRSTNAME");
				String lastName = rs.getString("LASTNAME");
                String usern = null;
                String position = rs.getString("POSITION");
                boolean management = rs.getBoolean("MANAGEMENT");
                String passw = null;
                emp = new Employees(id, firstName, lastName, usern, position, management, passw);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        }
 
        return emp;
			
	}
	
	

}
