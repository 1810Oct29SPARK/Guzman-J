public class Driver {

	public static void main(String[] args) {

	  System.out.println("this is the point of entry into my program.");

	  //make a car object with no set fields
	  //declare the variable carOne and assign a new Car to it

	  Car carOne = new Car();
	  Truck truckOne = new Truck();

	  //toString is a method inherited from Object

	  System.out.println("carOne: " + carOne.toString());
	  System.out.println("truckOne: " + truckOne.toString());

	  //make a car object with instance variables set in the constructor
	  //declare the variable CarTwo and assign an new Car to it
	  Car carTwo = new Car(1972, "DeLorean","DMC");
	  Truck truckTwo = new Truck("1500", "two-door");
	  //check out the toString result
	  System.out.println("carTwo: "+carTwo.toString());
	  System.out.println("truckTwo: "+truckTwo.toString());

	  //try to view instance variables of carTwo
	  //this does NOT COMPILE     System.out.println(carTwo.model);
	  System.out.println("model of carTwo: "+carTwo.getModel());
	
	  //reset the model of carTwo
	  carTwo.setModel("NotDeLorean");
	  System.out.println("model of carTwo: "+carTwo.getModel());

	  //test out carTwo's inherited move() method
	  carTwo.move();
	  truckTwo.move();
	}
}
