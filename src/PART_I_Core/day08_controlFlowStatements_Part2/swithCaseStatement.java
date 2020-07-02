package PART_I_Core.day08_controlFlowStatements_Part2;

public class swithCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String weather="Sunny";
		
		switch(weather) {
		
		case "Sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
			
		case "hot":
			System.out.println("Go to Swimming");
			System.out.println("Code Java");
			break;
			
		case "windy":
			System.out.println("Fly a Kite");
			System.out.println("Code Java");
			break;
			
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;	
			
		default:
			System.out.println("Code Java in any other weather");
		}
	}

}
