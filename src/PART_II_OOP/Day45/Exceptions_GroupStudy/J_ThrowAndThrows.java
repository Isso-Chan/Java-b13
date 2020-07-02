package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class J_ThrowAndThrows {
public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello World");
		
		//throw new RuntimeException("This is some exception");
		
		//throw new Exception("Another exception");
		
		
		String username = "";
	
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid username");
		}
		sleep3(2);
	}
	
	public static void sleep(int seconds) throws InterruptedException  {
		
		Thread.sleep(seconds*1000);
	}

	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds)  {
		try {
			sleep2(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void sleep4(int seconds) {
		
				sleep3(seconds);
			
		
	}


}
