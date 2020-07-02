package PART_II_OOP.Day43.Polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		Animal b=new Dog();
		Animal c=new Bird();
		
		Animal animal=new Animal();
		animal=new Dog();
		animal=new Bird();
		
		//parent    child
//		 Bird b=new Dog(); WRONG-->no relationship between each other
	}
}

class Animal{}
class Dog extends Animal{}
class Bird extends Animal{}