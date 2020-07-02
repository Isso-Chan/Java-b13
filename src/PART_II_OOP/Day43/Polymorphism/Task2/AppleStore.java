package PART_II_OOP.Day43.Polymorphism.Task2;

public class AppleStore {

	public static void main(String[] args) {
		
		Apple mac=new Mac();
		mac.use();
//		mac.code();// overridden bir method değil, HATA verir
		
		Mac myMac=new Mac();
		myMac.use();
		myMac.code();
		
		Apple watch= new AppleWatch();
		watch.use();
	}

}
