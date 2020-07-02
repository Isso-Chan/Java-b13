package PART_II_OOP.Day38_Inheritance_part_II.Task2_DogTest;

public class Dog extends Animal { // Parentde parametreli constructor olduğundan CALL etmek zorundayım. Onu da super() keyword. O da alttaki gibi constructor içinde olmak zorunda.

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight); // Bunlar Super classda olduğundan burada da olmak zorunda. Aynı zamanda bunlar oto olarak constructorda çıkar
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew() is called");
	}

	@Override
	public void eat() {
		System.out.println("Dog eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	
	
	
	
}
