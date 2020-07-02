package Assignments.Assignment_6;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int uBound=11, sum=0;
		int i=1;
		while(i<=uBound) {
			if(i==1) {
				System.out.print(i);
				sum=sum+i;
			}else {
				System.out.print("+"+i);
				sum=sum+i;
			}
			i+=1;
		}
		System.out.println("="+sum);
	}

}
