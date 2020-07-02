package PART_II_OOP.Day33_Constractors;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	
	//#1
	public Mouse(int weight) {
		this(30,20);// it means we call the constructor that has 2 parameters. MUST BE IN FIRST LINE like here
		// this(30,10); 2 constructor aynı yerde cagrilmaz. Sadece bir adet ilk statement olur. Virgülden sonra yazarsak ikinci oluyor.
		this.weight=weight;	
	}


	//#2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight); // we are calling #3
		this.numTeeth = numTeeth;
		this.weight = weight;
	}

	//#3
	public Mouse(int nemTeeth, int numWhiskers, int weight) {
		this.numTeeth = nemTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(weight+ " "+numTeeth+" "+numWhiskers);
	}
	
	
}
