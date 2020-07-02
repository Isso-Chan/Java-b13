package PART_II_OOP.Day41_Abstraction.Task1;

public abstract class Animal {  // class içinde abstract method varsa; class must be also ABSTRACT
	
	public abstract void eat(); // Abstract method
	
	public abstract void breath();
	
	public void move() { // instance method
		System.out.println("Moving");
	}

}
