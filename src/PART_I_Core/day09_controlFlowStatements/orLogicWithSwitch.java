package PART_I_Core.day09_controlFlowStatements;

public class orLogicWithSwitch {

	public static void main(String[] args) {
		
		char grade='D';
		// A or B or C -> pass or E -> fail
		
//		switch (grade) {
//		case 'A':
//			System.out.println("pass");
//			break;
//		case 'B':
//			System.out.println("pass");
//			break;
//		case 'C':
//			System.out.println("pass");
//			break;
//		case 'D':
//			System.out.println("fail");
//			break;
//		case 'E':
//			System.out.println("fail");
//			break;
//		}
		
		switch (grade) {
		case 'A': //case 'A': case 'A':       yanyana da yazilebilir
		case 'B':
		case 'C':
			System.out.println("pass");
			break;
		case 'D': case 'E':
			System.out.println("fail");
			break;
			
		}

	}

}
