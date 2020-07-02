package Assignments.Assignment_5;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfBedrooms=3;
		int startingPrice=0;
		
		if (numberOfBedrooms==1) {
			startingPrice=1100;
			System.out.println("One bedroom selected");
			System.out.println("Starting Price: " + startingPrice);
		} else if (numberOfBedrooms==2) {
			startingPrice=1850;
			System.out.println("Two bedrooms selected");
			System.out.println("Starting Price: " + startingPrice);
		} else if (numberOfBedrooms==3) {
			startingPrice=2550;
			System.out.println("Thre bedrooms selected");
			System.out.println("Starting Price: " + startingPrice);
		} else
			System.out.println("No such Bedrooms available");
		
	}

}
