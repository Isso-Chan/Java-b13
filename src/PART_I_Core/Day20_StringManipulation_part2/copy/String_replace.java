package PART_I_Core.Day20_StringManipulation_part2.copy;

public class String_replace {

	public static void main(String[] args) {
		
		String str="Moskov is a capital of Russia";
		
		str=str.replace("Moskov", "Bakü").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email="firstName_lastName@gmail.com";
		
		String company="capitalone";
		String newEmail=email.replace("gmail", company);
		System.out.println(newEmail);

	}

}
