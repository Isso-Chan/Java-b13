package PART_II_OOP.Day42.Interface;

public class TeslaSemi extends ElectricTruck { // concrete Class!!! We have to all unimplemented abstract methods

	private double engineSize;
	
		public TeslaSemi(String model, double price, String color, double engineSize) {
			super(model, price, color);
			this.engineSize = engineSize;
		}
	
		@Override
		public void load(String item) {
			System.out.println("TeslaSemi - load " + item + " by lowering the truck and opening door...");
		}
	
		@Override
		public void start() {
			System.out.println("TeslaSemi - start truck by pressing a button..");
			
		}
	
		@Override 	// Örnek: ElecricTruck implement ederse buraya gerek kalmıyor
		public void charge() {
			System.out.println("TeslaSemi - plugin charge for 30 mins...");
			
		}
	
		@Override
		public void drive() {
			System.out.println("TeslaSemi - truck is driving with load...");
			
		}
	
		public double getEngineSize() {
			return engineSize;
		}




}
