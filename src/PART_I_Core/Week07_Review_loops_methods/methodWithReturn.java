package PART_I_Core.Week07_Review_loops_methods;

public class methodWithReturn {

	public static void main(String[] args) {

		System.out.println(getName());
		
		String myName=getName();
		System.out.println(myName);
		
		int Wallet=giveMeFiveDollars();
		System.out.println(Wallet);
		
		fiveDollars();
		
		

	}
	public static void fiveDollars() {
		int dollars=5;
	}

	public static int giveMeFiveDollars() {
		int dollars=5;
		return dollars;
	}
	
	public static String getName() {
		return "Mike";
	}

}
