package PART_II_OOP.Day36.StaticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student(30, "Mike", 1000, "Cybertek"); // Bütün schoollar default Cybertek oluyor. Static olduğundan
//		Student s2=new Student(20, "Ozzy", 1200, "CybertekEU");
//		Student s3=new Student(10, "Jamal", 1500, "CybertekEU2");
		
//		Student s1=new Student(30, "Mike", 1000);
		Student s2=new Student(20, "Ozzy", 1200);
//		Student s3=new Student(10, "Jamal", 1500);
		
//		s1.school="CybertekEU";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
//		System.out.println(s3.toString());
		

	}

}
