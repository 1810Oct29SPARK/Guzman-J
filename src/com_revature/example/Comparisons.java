package com_revature.example;

import java.util.ArrayList;
import java.util.List;

import com.revature.transport.Car;

public class Comparisons 
{

	public static void main(String[] args) 
	{
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(2021, "spaceship", "Tesla", 50));
		carList.add(new Car(1997, "Fiesta", "Ford", 500));
		carList.add(new Car(2007, "Fancy", "Cadillac", 50));
		System.out.println(carList.get(0).compareTo(carList.get(2)));
		
	}

}
