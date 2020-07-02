package PART_I_Core.Week07_Review_loops_methods;

public class continueExample {

	public static void main(String[] args) {


		for (int i=1;i<=10;i++) {
			if (i>=2 && i<=4) {
				System.out.println("Skipping-"+i);
//				continue;
				break;
			}
			System.out.println("i= "+i);
		}

	}

}
