package PART_I_Core.Day27_arrays_part4.copy;

public class Task95_scoreCalculation {

	public static void main(String[] args) {
		
		int[][] scores= {
				{68,75,54,80},  //student-0
				{100,64,20,50},
				{10,35,40,90}};
		
		// calculate the avarage of 1. student
		int sum=0;
		for(int column=0;column<scores[0].length;column++) {
			sum=sum+scores[0][column];
		}
		System.out.println(sum/scores[0].length);
		
		
		// sum of the math scores
		int sum2=0;
		for(int row=0;row<scores.length;row++) {
			sum2=sum2+scores[row][0];
		}
		System.out.println("Math scores: "+sum2);
		

	}

}
