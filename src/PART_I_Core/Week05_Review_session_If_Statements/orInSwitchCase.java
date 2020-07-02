package PART_I_Core.Week05_Review_session_If_Statements;

public class orInSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int note=5;
		switch (note) {
		case 1:
			System.out.println("very bad");
//			break;
		case 2: case 3:
			System.out.println("bad");
//			break;
		case 4:
			System.out.println("Ok");
//			break;
		case 5:
			System.out.println("good");
//			break;
		default:
			System.out.println("Invalid Selection");
		}
	}

}
