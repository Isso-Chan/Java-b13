package Assignments.Assignment_7;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0, maxNum=7;
		
		while (count<=maxNum) {
			for (int i=1;i<=count;i++) {
				System.out.print(i);
			}
			count=count+1;
			System.out.println();
		}
		while(count>0) {
			count=count-1;
		for (int i=1;i<count;i++) {
			System.out.print(i);
		}
		System.out.println();
		}
		
	}

}
