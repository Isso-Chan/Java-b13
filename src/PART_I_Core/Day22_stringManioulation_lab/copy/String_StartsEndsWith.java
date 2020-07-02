package PART_I_Core.Day22_stringManioulation_lab.copy;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1="eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.endsWith("ips"));

		
		// Mr. => married man
		// Mrs. => married woman
		// Ms => some woman
		// Dr. => doctor man or woman
		// no title=> unknown status
		String person="Mr. Ali";
		if(person.startsWith("Mr")) {
			System.out.println("This person is a married man");
		}else if(person.startsWith("Mrs")) {
			System.out.println("This person is a married woman");
		}else if(person.startsWith("Ms")) {
			System.out.println("This person is a some woman");
		}else if(person.startsWith("Dr")) {
			System.out.println("This person is Doctor man or woman");
		}else
			System.out.println("Unknown status");
	}

}
