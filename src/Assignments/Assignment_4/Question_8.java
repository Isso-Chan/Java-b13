package Assignments.Assignment_4;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int retail=99;
		int quantity=10;
		double discount=0;
		double price=retail*quantity;
		
		if (quantity>=10 && quantity<=19) {
			discount=retail*0.20;
		} else if (quantity>=20 && quantity<=49) {
			discount=retail*0.30;
		} else if (quantity>=50 && quantity<=99) {
			discount=retail*0.40;
		} else if (quantity>=100) {
			discount=retail*0.50;
		} if (discount>0) {
			System.out.println("Discount :" + discount + " and Total purschase: " + (price-discount));
		} else {
			System.out.println("Total purschase: " + (price));
		}
		
	}

}
