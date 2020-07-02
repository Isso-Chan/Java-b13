package PART_II_OOP.Day40_accessModifiers_final_hiding.Task4_Parent_Hiding;

public class TestParentChild {

	public static void main(String[] args) {
		
		Child s=new Child();
		System.out.println("Value of x before increment "+s.x);
		
		s.increment();
		System.out.println("Value of x after increment "+s.x);

		Parent p=new Parent();
		System.out.println("Value of x before increment "+p.x);
		p.increment();
		System.out.println("Value of x before increment "+p.x);// This is not OVERRIDING (instance variable-->HIDING)
	}

}
