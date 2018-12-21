package com.revature.transport;

import com.revature.transport.Vehicle;

public class Tornado extends Vehicle 
{

	public Tornado(double maxWindSped)
	{
		super();
		this.maxWindSped = maxWindSped;
	}

	public Tornado() 
	{
	
	}
	
	private double maxWindSped;
	private boolean isInSupercell; //hooray for weather!

	@Override
	public void move() throws MaintenanceException
	{
		if (!this.isInSupercell)
		{
			throw new MaintenanceException("weather machine incorrectly configured");
		}
		System.out.println("DESTROYING THE CITY");

	}

	@Override
	public String toString() {
		return "Tornado [maxWindSped=" + maxWindSped + "]";
	}

	public double getMaxWindSped() {
		return maxWindSped;
	}

	public void setMaxWindSped(double maxWindSped) {
		this.maxWindSped = maxWindSped;
	}

}
