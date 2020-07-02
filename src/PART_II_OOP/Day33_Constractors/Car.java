package PART_II_OOP.Day33_Constractors;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	
	
	// cerate constructor
	
	public Car() {
		model="Honda";
		make="Civic";
		year=2020;
		mile=5000;
		color="Red";
	}
	
//	public Car(String mo, String ma, int yr, double ml, String cl) {
//		model=mo;
//		make=ma;
//		year=yr;
//		mile=ml;
//		color=cl;
//	}
	
	public Car(String model, String make, int year, int mile, String color) {
		model=model;   // sol taraf object, sag taraf variable
		make=make;
		year=year;
		
	}

	
	/**
	 * @param model
	 * @param make
	 */
	public Car(String model, String make) {
		super();
		this.model = model;
		this.make = make;
	}

	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
}
