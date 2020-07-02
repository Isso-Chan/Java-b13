package PART_II_OOP.Day36.StaticClassMembers;

public class Deneme {
	public Deneme(int x) {
		System.out.println("One argument constructor");
	}

	public Deneme() {
		System.out.println("No argument constructor");
	}
	
	{
		System.out.println("First xxnstance init");
	}
	
	static {
		System.out.println("First static init");
	}
	
	{
		System.out.println("Second instance init");
	}
	static {
		System.out.println("Second static init");
	}
}
