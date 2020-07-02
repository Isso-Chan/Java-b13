package PART_I_Core.Day27_arrays_part4.copy;

public class Length {
	
	public static void main(String[] args) {
	
		int [][] numbers= {
				{1,2,3,4},				// row-0
				{5,6},					// row-1
				{9,10,11,12,23,45,67}	// row-2
		};
		
		// Display the number of rows
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Number of columns in row "+i+" is "+numbers[i].length);
		}
		System.out.println("----------------------------------");
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print((i+1)+"th row: ");
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+",");
			}
			System.out.println();
		}
		
		
		
		
	}
}
