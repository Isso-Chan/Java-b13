package PART_I_Core.day09_controlFlowStatements;

public class switchRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String lastName="Smith";
		String firstName="Mike";
		
		int id=0;
		
		switch (firstName) {
		case "Test":
			System.out.println();
			break;
		case lastName: // hata verir. Cunku variable'den gelirse yukarida tanimlamada FINAL olmak zorunda degismemesi icin!!!!
			id=5;
			break;
			
		}
	}

}
