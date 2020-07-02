package PART_I_Core.day12_controlFlowStatements;

public class labelStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		outer:
			do {
				i=8;
				inner:
					while (true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			} while(true);
	}

}
