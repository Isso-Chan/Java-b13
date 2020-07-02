package Assignments.Assignment_4;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numBooks=0;
		int points=0;
		
		switch (numBooks) {
		case 0: 
			break;
		
		case 1:
			points=5; break;
		
		case 2:
			points=15; break;
			
		case 3:
			points=30; break;
		
		default:
			points=60; break;	
		} System.out.println("Pursched books " + numBooks+ ", points awarded " + points);
	}

}
