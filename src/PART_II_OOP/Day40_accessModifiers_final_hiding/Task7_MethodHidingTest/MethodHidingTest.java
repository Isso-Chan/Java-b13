package PART_II_OOP.Day40_accessModifiers_final_hiding.Task7_MethodHidingTest;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		

	}

}

class Bear{
	
	public static void eat() { // HIDING not overriding(static keyword)
		System.out.println("Bear is eating");
	}
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Panda extends Bear{
	
	public static void eat() { // Parent static olduğundan bu da static(hide için)
		System.out.println("panda is sneezing");
	}
//	public void sneeze() { // Parent ile aynı türden olmak zorunda. Ama burada STATIC yok, o yüzden HATA veriyor.
//		System.out.println("Panda is sneezing");
//	}
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}
