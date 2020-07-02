package PART_I_Core.day09_controlFlowStatements;

public class Task37_laptopModels {
	public static void main(String[] args) {
	
		String computer="Dell";
		
		switch (computer) {
		
		case "Apple":
			System.out.println("No virus");
			break;
		case "Dell":
			System.out.println("Touch One");
			break;
		case "Acer":
			System.out.println("Not Recommended");
			break;
		default:
			System.out.println("Do not buy that one");
		// Break yazmak zorunda degiliz (Cunku default en sonda
		}
}
}
