package PART_II_OOP.Day40_accessModifiers_final_hiding.Task8.Marsupial;

public class Kangaroo extends Marsupial {

	public static boolean isBiped() {// static oldugundan bu methodu Family HIDE eder. Static olmadan bu devrede, family gorülmez.
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "+isBiped());
	}
}
