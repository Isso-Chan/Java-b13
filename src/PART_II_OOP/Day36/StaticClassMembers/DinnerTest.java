package PART_II_OOP.Day36.StaticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner dad=new Dinner();
		
		System.out.println("Total slices: "+Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		dad.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
		
		dad.takeASlice(3);
		kid.takeASlice(2);
		
		System.out.println(Dinner.pizzaSlice);

	}

}
