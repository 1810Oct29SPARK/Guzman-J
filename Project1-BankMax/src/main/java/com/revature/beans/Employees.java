package com.revature.beans;

public class Employees {
	
	public Employees(int id, String firstName, String lastName, String username, String position, 
			boolean management, String password)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.position = position;
		this.management = management;
		this.password = password;
		
		
	}
	
	public Employees() 
	{
		
	}
	
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String position;
	private boolean management;
	private String password;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isManagement() {
		return management;
	}

	public void setManagement(boolean management) {
		this.management = management;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", position=" + position + ", management=" + management + ", password=" + password + "]";
	}

}
