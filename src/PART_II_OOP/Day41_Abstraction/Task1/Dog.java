package PART_II_OOP.Day41_Abstraction.Task1;

public class Dog extends Animal{ // Parent classtakileri implement etmediğimiz için Dog ikaz ediyor!! Alttaki breath methodu override'ı bunun için yaptık

	
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}
