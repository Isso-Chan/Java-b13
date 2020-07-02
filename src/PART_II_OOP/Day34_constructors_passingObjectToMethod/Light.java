package PART_II_OOP.Day34_constructors_passingObjectToMethod;

public class Light {

	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false);  // calling constructor with 2 parameters
		System.out.println("Returning from no-argument constructor no.");
	}
	
	public Light (int watt, boolean ind) {
		this(watt, ind, "x");  // calling other constructor that has 3 parameters
		System.out.println("Returning from constructor no.2");
		
	}

	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
	}
	
	
}
