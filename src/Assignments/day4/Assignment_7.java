package Assignments.day4;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int change, quarters, dimes, nickles, cost;
		cost=95;
		change=100-cost;
		quarters=change/25;
		dimes=(change-quarters*25)/10;
		nickles=change-quarters*25-dimes*10;
		
		System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes, and " + nickles + " nickles");
		
		
	}

}
