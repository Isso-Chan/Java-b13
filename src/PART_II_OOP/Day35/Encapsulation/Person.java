package PART_II_OOP.Day35.Encapsulation;

public class Person {

	// instance variables
	private String name;
	private int age;  // how I can restrict the access? (-35)
	private char gender;
	
	
	
	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}


	public void setAge(int age) { // used to set the value
		//condition 			// Yukarıda condition koyamıyoruz. Avantajı bu.
		
		this.age=age;
	}

	public int getAge() {
		return age;
	}
}
