package PART_I_Core.day13_methods_Part1.copy;

public class LoopCallMethod {

	public static void main(String[] args) {
	
		System.out.println("Hello from the main method");
		for (int i=0; i<5;i++) {
			displayMessage();
			System.out.println("Back in the main Method");
		}

	}

	private static void displayMessage() {
		System.out.println("Hello from displayMessage method");
		
	}

}
