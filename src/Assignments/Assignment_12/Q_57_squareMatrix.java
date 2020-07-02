package Assignments.Assignment_12;

public class Q_57_squareMatrix {

	public static void main(String[] args) {
		
		int[][] matrix={{1,2,3},{4,5,6},{9,8,9}};

		int sum1=matrix[0][0]+matrix[1][1]+matrix[2][2];
		int sum2=matrix[0][2]+matrix[1][1]+matrix[2][0];
		System.out.println(Math.abs(sum1-sum2));
	}
	

}
