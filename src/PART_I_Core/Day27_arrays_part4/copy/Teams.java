package PART_I_Core.Day27_arrays_part4.copy;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {
		
//		String[][] teams= new String[2][4];
		
//		teams[0][0]="Mike";
//		teams[0][1]="Tonny";
//		teams[0][2]="Smith";
//		teams[0][3]="Evan";
//		
//		teams[1][0]="David";
//		teams[1][1]="Emmy";
//		teams[1][2]="John";
//		teams[1][3]="Ryan";
		
		String [][] teams= { {"Mike","Tonny","Smith","Evan"} , //row0
							 {"David","Emmy","John","Ryan"} }; //row1
		
		System.out.println("First player of the team: "+teams[0][0]);
		
		System.out.println("numbers of rows: "+teams.length);
		System.out.println("# People in first team: "+teams[0][1].length());
		System.out.println("# People in second team: "+teams[1].length);
		
		int[][] numbers= {{1,2,3}, {4,5}, {7,8,9}};
		
		System.out.println(numbers[1][1]);
		
		Arrays.sort(teams[0]);
		System.out.println("Sorted teams: "+(Arrays.deepToString(teams)));
		
		
		

	}

}
