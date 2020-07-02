package Assignments.Assignment_4;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour=31;
		char packages='B';
		double bill=0;
		
		switch (packages) {
		case 'A':
			if (hour>10) {
				bill=9.95+(hour-10)*2;
			} else {
				bill=9.95;
			}
			break;
		case 'B':
			if (hour>20) {
				bill=13.95+(hour-20);
			} else {
				bill=13.95;
			}
			break;
		case 'C':
			bill=19.95;
			break;
		} System.out.println("Bill: " + bill);
			
	}

}
