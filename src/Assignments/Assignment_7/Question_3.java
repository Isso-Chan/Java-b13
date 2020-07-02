package Assignments.Assignment_7;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=num;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=num;i>1;i--) {
			for (int j=1;j<=i-2;j++) {
				System.out.print(" ");
			}
			for (int k=i-1;k<=num;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
			
	}

}
