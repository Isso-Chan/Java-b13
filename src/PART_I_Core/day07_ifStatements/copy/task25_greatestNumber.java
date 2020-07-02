package PART_I_Core.day07_ifStatements.copy;

public class task25_greatestNumber {

	public static void main(String[] args) {
		// write a java program that will accept three numbers and return the geratest number

		int i1=50, i2=10, i3=10, ig;
		if(i1>i2 && i1>3) {
			ig=i1;
			System.out.println("Num 1 is the greatest");
			
		}
		if (i2>i1 && i2>i3) {
			System.out.println("Num 2 is the greatest");
			
		}
		if (i3>i1 && i3>i2) {
			System.out.println("Num 3 is the greatest");
			
		}
		
	}

}
