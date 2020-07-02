package PART_I_Core.Day16_Pbjects_and_Classes.copy;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + "is working hard");
	}
	
	public void attedMeeting() {
		System.out.println(name+ " is attending a meeting");
	}
	
	public void introduce() {
		System.out.println("Name: "+ name + "Job Title: " + jobTitle+ " Salary: " + salary);
	}
	
}
