package PART_II_OOP.Day45_Exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
//		throw new RuntimeException("This is some exception");
		
//		throw new Exception("An other exception");

		String username="";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
			
		}else {
			System.out.println("Valid username");
		}
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}

}
