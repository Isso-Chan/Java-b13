package PART_I_Core.day11_whileLoop;

public class whileLoop {

	public static void main(String[] args) {
		
		int i=0;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		// using a loop, iterate until we have 10 students in the room
		
		int numberOfStudents=1;
		
		while(numberOfStudents<=10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}
	}

}
