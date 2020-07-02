package PART_II_OOP.Day35.Encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person("abc",'F');
		
//		p1.age=-35;  Hata veriyor. Private olarak tanımladık class'ta.
		
		p1.setAge(35);

	System.out.println(p1.getAge());
	System.out.println(p1.toString());

	}

}
