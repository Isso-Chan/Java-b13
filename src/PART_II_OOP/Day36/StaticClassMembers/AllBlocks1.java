package PART_II_OOP.Day36.StaticClassMembers;

public class AllBlocks1 {

			
	public AllBlocks1(int x) {
		System.out.println("One argument constructor");
	}

	public AllBlocks1() {
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
