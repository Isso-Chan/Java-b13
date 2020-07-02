package PART_I_Core.Week09_Review_String;

public class charAt {

	public static void main(String[] args) {
		
		String str="cybertek";
		String str2="Amazo website";

		System.out.println(str.length());
		
		if(str2.contains("Amazon")) {
			System.out.println("This is Amazon account");
		}else
			System.out.println("This is not an Amazon account");

		
		//title checking
		
		String title="Porsche Home - Porsche USA";
		if(title.contains("Porsche")) {
			System.out.println("Test case passed. Correct title");
		} else {
			System.out.println("Test case failed. Wrong title");
		}
			
	}

}
