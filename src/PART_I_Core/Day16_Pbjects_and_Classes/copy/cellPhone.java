package PART_I_Core.Day16_Pbjects_and_Classes.copy;

public class cellPhone {

	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println(brand+ " is our brand");
	}
	
	public void message() {
		System.out.println(brand + " send this message to you");
	}
	
	public void takePhoto() {
		System.out.println(brand+" also takes photo");
	}
}
