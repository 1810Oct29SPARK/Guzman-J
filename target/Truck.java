public class Truck extends Vehicle {
	
	public Truck() {
	  System.out.println("called noargs constructor");
	}

	public Truck(String truckType, String doorAmount){
	  this.truckType = truckType;
	}

	private String truckType;
	private String doorAmount;

	public String getTruckType() {
	  return this.truckType;
	}

	public String getDoorAmount() {
	  return this.doorAmount;
	}

	public void setTruckType() {
	  this.truckType = truckType;
	}

	public void setDoorAmount() {
	  this.doorAmount = doorAmount;
	}

	@Override
	public void move() {
	  System.out.println("The Truck is moving");
	}
}
