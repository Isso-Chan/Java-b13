package PART_II_OOP.Day34_constructors_passingObjectToMethod.CarFirma;

public class Tire {

	double radius;
	String type;
	String purpose;
	double price;
	
	public Tire(double radius, String type, String purpose) {
		this.radius = radius;
		this.type = type;
		this.purpose = purpose;
	}
	
	public double GetTirePrice() {
		
		if(radius<13) {
			price=25;
		}else if(radius==13) {
			price=35;
		}else {
			price=45;
		}
		printTireInfo();
		return price;
	}
	
	public void printTireInfo() {
		System.out.print("Tire : "+ radius+", "+type+", "+purpose);
		System.out.println("---> cost: "+price);
	}

}
