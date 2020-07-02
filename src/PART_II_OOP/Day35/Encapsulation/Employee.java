package PART_II_OOP.Day35.Encapsulation;

public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	public Employee() {
		name="";   		// privat olarak burada tanımlı olduğundan test ekranında çıkmazlar
		idNumber=0;	// privat olarak burada tanımlı olduğundan test ekranında çıkmazlar.ÇIKIYOR AMA??
		department="ww";	// privat olarak burada tanımlı olduğundan test ekranında çıkmazlar
		position="ww";	// privat olarak burada tanımlı olduğundan test ekranında çıkmazlar
	}
	
	public Employee(String name, int idNumber) {
		this.name=name;
		this.idNumber=idNumber;
		department="dd";  // privat olarak burada tanımlı olduğundan test ekranında çıkmazlar
		position="pp";    // privat olarak burada tanımlı olduğundan test ekranında çıkmazlar
	}
	
	public Employee(String name, int idNumber, String department, String position) {
		this.name=name;
		this.idNumber=idNumber;
		this.department=department;
		this.position=position;
	}

	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position="
				+ position + "]";
	}

	public String getName() {
		return name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
}
