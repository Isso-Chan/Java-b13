package Assignments.Assignment_4;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String medium="Steel";
		long time=0;
		long distance=20000;
		
		switch (medium) {
		case "Air":
			time=distance/1100;
			break;
			
		case "Water":
			time=distance/4900;
			break;
			
		case "Steel":
			time=distance/16400;
			break;
		default:
			System.out.println("Invalid entry!!");
			break;	
		} 
		if (time>0) {
			System.out.println("Time: " + time + " second");
		}
	}

}
