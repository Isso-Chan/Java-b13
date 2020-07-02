package PART_II_OOP.Day37_Inheritance.Task2;

public class Company_ForTest {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		emp1.name="Tom";
		emp1.jobTitle="SDET";
		emp1.age=27;
		emp1.gender='M';
		
		emp1.eat("Salad");
//		emp1.atttendClass(); // Hata verir. Çünkü student-Employee class ilişkisi yok!! 
//		Diğer hepsi person class'tan alınıyor.
	}
}
