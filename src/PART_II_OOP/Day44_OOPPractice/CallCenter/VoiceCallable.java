package PART_II_OOP.Day44_OOPPractice.CallCenter;

public interface VoiceCallable {

	boolean CAN_CALL=true; // otomatik--> public static final
	
	void call(String contact); // otomatik--> public abstract
	
	static void decline() {  // otomatik--> public
		System.out.println("Mike declined voice call...");
	}
	default void accept() { // otomatik--> public. default-->access modifier DEĞİL!. Can be overridden!
		System.out.println("Mike finally accepted voice call....");
	}
	
}
