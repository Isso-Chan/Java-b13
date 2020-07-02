package PART_I_Core.day11_whileLoop;

public class nestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5;i++) {
			System.out.println("Outer loop Iteration");
			
			for (int j=1;j<=2;j++) {
				System.out.println("i= " + i + "; j= " + j);
			}
		}
		

		
	}

}
