package PART_II_OOP.Day37_Inheritance.Task2;

public class Employee extends Person {

	String jobTitle;
	
	public void work() {
		System.out.println(name+ " is working as "+ jobTitle); // name comes from parent-inheritet
	}

	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender	+ "]";
	}
	
	
}
