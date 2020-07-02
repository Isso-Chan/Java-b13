package Assignments.Assignment_6;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=20;
		int fNum1=0, fNum2=1, fNum3=0;
		
		for(int i=1;i<=n;i++) {
			if(i==1) {
				System.out.print(fNum1+", "+fNum2+", ");
			} else {
				
				fNum3=fNum2+fNum1;	
				System.out.print(fNum3+", ");
				fNum1=fNum2;
				fNum2=fNum3;
			}

				
			
		}
	}

}
