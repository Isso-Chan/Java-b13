package PART_I_Core.day09_controlFlowStatements;

public class Task39_trafficLightSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char color='r';
		switch (color) {
		
		case 'r': case'R':
			System.out.println("Red Light");
			break;
		case 'o':case'O':
			System.out.println("Orange Light");
			break;
		case 'g':case 'G':
			System.out.println("Green Light");
			break;
		default:
				System.out.println("Invalid Light");
		}
	}

}
