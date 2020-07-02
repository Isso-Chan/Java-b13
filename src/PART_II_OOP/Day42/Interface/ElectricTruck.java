package PART_II_OOP.Day42.Interface;

public abstract class ElectricTruck extends ElectricCar {

	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
	}
	
	public abstract void load(String item);

//	@Override	// OPTIONAL- Burası imlement ederse TeslaSeminin alması şartı kalkıyor
//	public void charge() {
//		// TODO Auto-generated method stub
//		
//	}

	
}
