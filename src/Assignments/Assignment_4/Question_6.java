package Assignments.Assignment_4;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mass=1;
		double weight=0;
		
		weight=mass*9.8;
		
		if (weight>1000) {
			System.out.println(" Object is too heavy!");
		} else if (weight<10) {
			System.out.println(" Object is too light");
		}
				
	}

}
