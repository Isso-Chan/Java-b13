package PART_II_OOP.Day40_accessModifiers_final_hiding.Task6.Rodent;

public class Mouse extends Rodent{

	protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail: "+ tailLength + ",parentTail: "+super.tailLength);
	}
}
