package Assignments.Assignment_4;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calls=20;
		double bill=0;
		
		if (calls<=100) {
			bill=200;
		} else if (calls>100 && calls<=150) {
			bill=200+(calls-100)*0.60;
		} else if(calls>150 && calls<=200) {
			bill=200+(50*0.60)+(calls-200)*0.50;
		} else if (calls>200) {
			bill=200+(50*0.60)+(50*0.50)+(calls-200)*0.40;
		}
		System.out.println("Your bill: " + bill);
	}
		

}
