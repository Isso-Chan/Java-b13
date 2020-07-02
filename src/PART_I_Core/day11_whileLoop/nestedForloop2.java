package PART_I_Core.day11_whileLoop;

public class nestedForloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<3; i++) {
			
			System.out.println("Outer loop at state: " +i);
			
			for (int p=0; p<=3; p++) {
				
				System.out.println("Inner loop at state: " + p);
				
				if (p==3) {
					System.out.println();
				}
			}
		}
	}

}
