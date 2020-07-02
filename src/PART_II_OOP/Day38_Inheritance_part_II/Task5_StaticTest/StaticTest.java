package PART_II_OOP.Day38_Inheritance_part_II.Task5_StaticTest;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj=new StaticSub();
		obj.num=5;
		obj.print();
		
		StaticSuper.num=10;
		obj.print();
		System.out.println(StaticSub.num);

		obj.m2();
		
	}

}
