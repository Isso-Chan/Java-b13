package PART_I_Core.day04_arithmeticOperators.copy;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This program calculates the sale price of an
		// item that is regulary priced at $59, with a 20% discount on it
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		
		System.out.println("Tegular Price: $" + regularPrice);
		System.out.println("Discount amount: $" + discount);
		System.out.println("Sales Price: $" + salesPrice);
	}

}
