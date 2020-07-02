package PART_I_Core.day13_methods_Part1.copy;

public class Task_64_Star_pattern {

	public static void main(String[] args) {
		
		star(5);

	}

	private static void star(int i) {

		for(int j=1;j<=i;j++) {
			for (int k=1;k<=j;k++) {
				System.out.print("*");
			}
			System.out.println();
		} 

		
	}

}
