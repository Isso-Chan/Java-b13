package PART_II_OOP.Day39_Inheritance_Review_AccessModifiers;

public class Car extends Vehicle{

	
	private int wheels;
	private int geers;
	private int doors;
	private boolean isManual;
	private int currentGear;
	
	
	public Car(int wheels, int geers, int doors, boolean isManual) {
		super();
		this.wheels = wheels;
		this.geers = geers;
		this.doors = doors;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	

	public void changeGear(int currentGear) {
		this.currentGear=currentGear;
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity():Velocity "+speed+" direction "+direction);
		move(speed, direction); // önce mevcut class'ta arar. Varsa ona gider.Bulamazsa parent'ta arar.
		super.move(speed, direction);
	}

	@Override  // annotation--> checkpoint for us, not compulsory
	public void move(int velocity, int direction) {
		setCurrentDirection(direction+10);
		setCurrentVelocity(velocity+10);
		System.out.println("Vehicle.move():Moving at "+getCurrentVelocity()+" in direction "+getCurrentDirection());
	}
	
	
	
	
	
	
}
