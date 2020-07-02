package PART_II_OOP.Day34_constructors_passingObjectToMethod.CarFirma;

public class Glass {

	String marken;
	double thickness;
	String purpose;
	String toWhichWindow;
	double price;
	
	public Glass(String marken, double thickness, String purpose, String toWhichWindow) {
		this.marken = marken;
		this.thickness = thickness;
		this.purpose = purpose;
		this.toWhichWindow = toWhichWindow;
	}
	
	public double getGlassPrice() {
		
		if(toWhichWindow.equalsIgnoreCase("front")){
				price=50;
		}else if(toWhichWindow.equalsIgnoreCase("rear")){
			price=35;
		}else {
			price=20;
		}
		printGlassProperties();
		return price;
	}
	
	public void printGlassProperties() {
		System.out.print("Glass : "+marken+", "+thickness+", "+purpose+", "+toWhichWindow);
		System.out.println("---> cost is: "+price);
	}
}
