package PART_II_OOP.Day43.Polymorphism;

public class instansof {

	public static void main(String[] args) {
		
		Shape sh=new circle();
		
		if (sh instanceof triangle) {
			System.out.println("Triangle");
		}else if (sh instanceof circle) {
			System.out.println("circle");
		}else if (sh instanceof square) {
			System.out.println("square");
		}
	}
}
