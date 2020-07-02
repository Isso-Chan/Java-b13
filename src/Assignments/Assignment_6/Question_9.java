package Assignments.Assignment_6;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				if(i%2!=0) {
					if (j%2!=0) {
						System.out.print("W");
					} else
						System.out.print("B");
				} else if (i%2==0) {
					if (j%2!=0) {
						System.out.print("B");
					} else
						System.out.print("W");
				}
					
			}
			System.out.println();
		}
	}

}
