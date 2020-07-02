package PART_II_OOP.Day36.StaticClassMembers;

public class Campus {

	private String city;
	static String country;
	
	static {
		System.out.println("Static block-1");
		country="USA"; // country static olduğu için bu static BLOCK içinde tanımlayabiliyoruz.
		// country static olmazsa burası complain!!!
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city=city;
	}
	
	static {
		System.out.println("Static block-2");
		country="UK";
	}
}
