package Assignments.Assignment_13;

import java.util.Arrays;

public class Q_79_scalarMatrix {

	public static void main(String[] args) {
		Integer[][] mtrx= {{1,1,1},{1,1,2}};
		int number=5;
		Integer[][] newMtrx=scalar(mtrx,number);
		System.out.println(Arrays.toString(newMtrx[0]));
		System.out.println(Arrays.toString(newMtrx[1]));
	}

	private static Integer[][] scalar(Integer[][] matrix, int num) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=matrix[i][j]*5;
			}
			
		}
		return matrix;
	}

}
