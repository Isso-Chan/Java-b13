package PART_II_OOP.Day40_accessModifiers_final_hiding.Task6.Rodent;

public class Rodent {

	protected int tailLength=4; // instance hiding. Child objesi hangi classın metodunu çağırırsa; o class'ın valuesi alınıyor!
	
	public void getRodentDetails() {
		System.out.println("parentTail:"+tailLength);
	}
}
