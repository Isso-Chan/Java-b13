package Assignments.Assignment_4;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long income=1400_000_000;
		double taxAmount=0;
		
		if (income<=150_000_000) {
			taxAmount=income*0.25;

		}else if (income>150_000_000 && income<=300_000_000) {
			taxAmount=(150_000_000*0.25)+(income-150_000_000)*0.30;
		
		}else if (income>300_000_000 && income<=600_000_000) {
			taxAmount=(150_000_000*0.25)+(150_000_000*0.30)+((income-300_000_000)*0.35);
		
		}else if (income>600_000_000 && income<=1_200_000_000) {
			taxAmount=(150_000_000*0.25)+(150_000_000*0.30)+(300_000_000*0.35)+((income-600_000_000)*0.40);
		
		}else if (income>1_200_000_000) {
			taxAmount=(150_000_000*0.25)+(150_000_000*0.30)+(300_000_000*0.35)+(600_000_000*0.40)+((income-1_200_000_000)*0.50);
		}
		System.out.println("Your income: " + income);
		System.out.println("The tax amount you have to pay: " + taxAmount);
	}

}
