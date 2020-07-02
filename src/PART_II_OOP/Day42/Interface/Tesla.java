package PART_II_OOP.Day42.Interface;

public class Tesla extends ElectricCar{

	public Tesla(String model, double price, String color) {
		super(model, price, color);
	}

	@Override
	public void start() {
		System.out.println("Tesla is starting quietly...");
		System.out.println("Change to drive mode...");
		
	}

	@Override
	public void charge() {
		System.out.println("Tesla charging- Plugin to electric outlet");
		
	}

	@Override
	public void drive() {
		System.out.println("Tesl is driving...");
		
	}


}
