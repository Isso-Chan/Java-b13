package PART_II_OOP.Day34_constructors_passingObjectToMethod.CarFirma;

public class Motor {

	double cc;
	String fuelType;
	String marken;
	double price;
	
	public Motor(double cc, String fType) {
		this.cc = cc;
		this.fuelType = fType;
	}

	public Motor(double cc, String marken, String fType) {
		this.cc = cc;
		this.marken = marken;
		this.fuelType=fType;
	}

	public Motor() {
	}
	
	public double getMotorPrice() {

		if(cc<=1.0) {
			price=5000;
		}else if(cc>1.0 && cc<2.0) {
			price=7500;
		}else {
			price=10000;
		}
		printMotorInfo();
		return price;
	}
	
	public void printMotorInfo() {
		System.out.print("Motor :"+cc+", "+marken+","+fuelType);
		System.out.println("---> price is: "+price);
	}
	
	
	
	
}
