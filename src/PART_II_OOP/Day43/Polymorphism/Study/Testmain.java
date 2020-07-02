package PART_II_OOP.Day43.Polymorphism.Study;

public class Testmain {

	public static void main(String[] args) {
		
		    Bike b = new Splandor();//upcasting  
		    b.run();
		    b = new C();//upcasting  
		    b.run();  
	}
}

class Bike {
	void run(){System.out.println("running");}  
}

class Splandor extends Bike {
	void run(){
	  System.out.println("running safely with 60km in Splandor");
	}  
}
class C extends Splandor{
	void sout() {
		System.out.println("C class sout ");
	}
	@Override
	void run() {
//		super.run();
		System.out.println("running in class C");
	}
}