package Assignments.Assignment_8;

public class question_04 {

	public static void main(String[] args) {
		
		int i=10;
		printHollowRect(i);

	}

	private static void printHollowRect(int i) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
			for(int k=2;k<i;k++) {
								
				if(j==1 || j==i ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			} 
			System.out.println("*");
		}
		
	}

}
