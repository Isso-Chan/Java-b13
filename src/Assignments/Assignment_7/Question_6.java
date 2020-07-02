package Assignments.Assignment_7;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int line=4, inc, lastNum=0;
		
		for(int i=1;i<=line;i++) {
			lastNum=i;
			inc=line-1;
			System.out.print(i);		
			
			for(int j=1;j<i;j++) {
				lastNum=lastNum+inc;
				System.out.print(lastNum);
				inc=inc-1;
			}
			System.out.println();
		}
		
		
	}

}
