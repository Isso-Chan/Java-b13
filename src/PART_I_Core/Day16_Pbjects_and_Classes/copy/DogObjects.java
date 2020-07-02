package PART_I_Core.Day16_Pbjects_and_Classes.copy;

public class DogObjects {

	public static void main(String[] args) {
		 
		
		Dog dog1= new Dog();
		Dog dog2= new Dog();
		Dog dog3= new Dog();
		
		dog1.age=10;
		dog1.color="Red";
		dog1.breed="maltese";
		dog1.name="Rover";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		System.out.println(dog1.veccination);
		
		dog1.barking();
		dog1.hungry();
		dog1.speeping();

	}

}
