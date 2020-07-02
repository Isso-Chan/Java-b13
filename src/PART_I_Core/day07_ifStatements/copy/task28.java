package PART_I_Core.day07_ifStatements.copy;

public class task28 {

	public static void main(String[] args) {
		/*Revenue can be calculated as the selling price of the product times the quantity sold, i.e.
revenue = price × quantity.Write a program that asks the user to enter product price and
quantity and then calculate the revenue. If the revenue is more than 5000 a discount is
10% offered. Program should display the discount and net revenue
		 */

		double revenue, price=100, discount=0; 
		int		quantity=200;
		revenue=price*quantity;
		boolean ss=false;
		
		if(revenue>5000) {
			discount=revenue*0.10;
			revenue=revenue-discount;
		}
		System.out.println("Discount= " + discount);
		System.out.println("Revenue= " + revenue);
		if(!ss) {
			System.out.println("ahhaa");
		}
	}

}
