package PART_II_OOP.Day40_accessModifiers_final_hiding.Task5_Final_Methods;

public class Finalmethods {

	public void method1() { // final yaparsak HATA. Final overriden olmaz!!
		System.out.println("Method-1");
	}
	
	public static void staticMethod(String word) {
		System.out.println("Static Method");
	}

}

class Sub extends Finalmethods {

	@Override
	public void method1() {
		System.out.println("Method-1 in su class");
	}
	
	public static void staticMethod(String word) {
		System.out.println("Static method in sub class");
	}
	
}

