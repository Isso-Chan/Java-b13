package PART_II_OOP.Day34_constructors_passingObjectToMethod.CarFirma;

public class Car {

	Glass glass;
	Motor motor;
	Tire tire;
	private String type;
	
	public Car(Glass glass, Motor motor, Tire tire, String type) {
		this.glass = glass;
		this.motor = motor;
		this.tire = tire;
		this.type = type;
	}
	
	public double printCarCost() {
		
		System.out.println("All about this car is below: ");
		System.out.println("This is a "+type.toUpperCase()+" car");
		double totalCost=glass.getGlassPrice()+motor.getMotorPrice()+tire.GetTirePrice();
		
		return totalCost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
