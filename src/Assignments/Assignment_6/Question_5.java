package Assignments.Assignment_6;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int endNum=11;
		int i=1;
		while(i<=endNum) {
			if (i==1) {
				System.out.print(i);
			}else if (i%2!=0) {
				System.out.print(", "+i);
			}
			i+=1;
		}
		
	}

}
