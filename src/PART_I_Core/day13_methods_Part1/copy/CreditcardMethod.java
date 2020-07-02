package PART_I_Core.day13_methods_Part1.copy;

public class CreditcardMethod {

	public static void main(String[] args) {
		
		double salary=50000;
		int creditRating=7;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();
		}else noQualify();
		
	}
	private static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the CC");
		
	}
	public static void qualify() {
		System.out.println("Congrads, you are qualified for the CC");
	}


}
