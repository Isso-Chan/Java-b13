package Assignments.Assignment_4;

public class Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int baseFee=10;
		double checks=20, checkFee=0;
				
		if (checks<20) {
			checkFee=checks*0.10;
			
		} else if (checks>=20 && checks<39) {
			checkFee=(19*0.10) + (checks-19)*0.08;
			
		} else if (checks>=40 && checks<59) {
			checkFee=(19*0.10) + (20*0.08) + (checks-39)*0.06;
			
		} else if (checks>=60) {
			checkFee=(19*0.10) + (20*0.08) + (20*0.06) + (checks-59)*0.06;
		}
		
		System.out.println("Sercice Fee is: " + (baseFee+checkFee));
	}

}
