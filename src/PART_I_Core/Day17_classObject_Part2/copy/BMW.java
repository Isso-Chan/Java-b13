package PART_I_Core.Day17_classObject_Part2.copy;

public class BMW {

	String make="BMW";
	String model;
	double price;
	
	public void showprice() {
		
		switch(model) {
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default:
			System.out.println(model+" is not available");
			price=0.0;
		}
		System.out.println("Price: " + price);
	}
}
