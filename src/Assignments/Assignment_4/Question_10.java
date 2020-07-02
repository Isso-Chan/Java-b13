package Assignments.Assignment_4;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fatGram=90, fatCalories=0, totalCalories=180;
		fatCalories=fatGram*9;
		
		
		if (fatCalories<=totalCalories) {
			
			if ((fatCalories/totalCalories)*100<30) {
				System.out.println("Food is low in fat");
		}
			
		} else if (fatCalories>totalCalories) {
			System.out.println("Input is invalid!!");
		}
		System.out.println(fatCalories/totalCalories);
	}

}
