package Assignments.Assignment_7;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7;
		for (int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print("0");
				}else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}
