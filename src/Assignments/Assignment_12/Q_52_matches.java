package Assignments.Assignment_12;

public class Q_52_matches {

	public static void main(String[] args) {
		int[][] array= {{2,2,1,3,4,5},{5,2,3,3,4,5},{3,2,3,1,4,5}};
		
		int matches=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length-1;j++) {
				if(array[i][j]==array[i][j+1]) {
					matches++;
				}
			}
		}
		System.out.println("Matches: "+matches);

	}

}
