package Assignments.Assignment_6;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int line=0;
		for(int i=4;i>=1;i--) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			line=line+1;
			
			for(int k=1;k<=line;k++) {
				System.out.print(" ");
			}
	
		}
	}

}
