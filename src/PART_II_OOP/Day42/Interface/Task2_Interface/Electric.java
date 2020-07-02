package PART_II_OOP.Day42.Interface.Task2_Interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES=true;
	
	boolean HAS_BATTERIES2= false; 	// public static final

	
	abstract void charge();			// otomatik public
	
	void charge2(); 				// do not complain. Automatic PUBLIC ABSTRACT(NO BODY)
	
	public default void MethodA() { // default method. Sadece interfacelerde olur, body'si var.

		//code
	}
	
	public static void MethodB() {	// abstract değilse, body'si olmalı.

		//code
		
	}
	
}
