package PART_II_OOP.Day40_accessModifiers_final_hiding.Task8.Marsupial;

public class Marsupial {

	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupiaDescription() {
		System.out.println("Marsupial walks on the two legs: "+isBiped());
	}
}
