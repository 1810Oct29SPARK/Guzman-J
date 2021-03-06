package com_revature.example;

import java.util.Arrays;

import com.revature.transport.Car;
import com.revature.transport.MaintenanceException;

public class GenericsAndReflection 
{

	public static void main(String[] args) 
	{
		/*Car c = new Car(2300, "fury roadster", "mad max", 1000);
		Object[] emptyCars = replicateWithGenerics(c, 3);
		try
		{
			((Car) emptyCars[2]).move();
		}
		catch (MaintenanceException e)
		{
			e.printStackTrace();
		}*/
		funWithReflections();
	}
	
	//fills an array of specified size with objects of the same type as passed in 
	static Object[] repilcate(Object O, int size)
	{
		Object[] replicants = new Object[size];
		for (int i = 0; i<size; i++)
		{
			replicants[i] = new Object();
		}
				
		return replicants;
	}
	
	static<T> T[] replicateWithGenerics(T t, int size)
    {
		Object[] replicants = new Object[size];
		for (int i = 0; i<size; i++)
		{
			try 
			{
				
			}
			catch(InstantiationException e)
			{
				e.printStackTrace();
			}
			catch(IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		return replicants;
    }
	
	//time to use the reflection API!
	//allows us to perform a runtime check on a variable's type
	//and do so much more
	//inspect classes at runtime as well
	
	static void funWithReflections()
	{
		//first thing: get a Class by its fully qualified name
		try {
			Class clazz = Class.forName("com.revature.transport.Tornado");
			System.out.println(clazz.getSimpleName());
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
