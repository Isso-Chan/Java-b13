package PART_I_Core.day05_weeklyReview.copy;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pies=10, people=4;
		double piesPerson;
		
		piesPerson=pies/people;
		System.out.println(piesPerson);  // double=int/int 
		
		piesPerson = pies/ (double)people;
		System.out.println(piesPerson);
	}

}
