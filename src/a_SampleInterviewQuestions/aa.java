package a_SampleInterviewQuestions;

public class aa {
	public static void main(String[] args) {
		

	/*Write a Java program to print the following pattern

	1 2 3 4 5 6 7
	 2 3 4 5 6 7
	  3 4 5 6 7
	   4 5 6 7
	    5 6 7
	     6 7
	      7
	     6 7
	    5 6 7
	   4 5 6 7
	  3 4 5 6 7
	 2 3 4 5 6 7
	1 2 3 4 5 6 7*/	
	

	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
			if(j<i) {
				System.out.print(" ");
			}else {
				System.out.print(j+" ");
			}
		}
			System.out.println();
	}
	for(int i=7;i>1;i--) {
		for(int j=1;j<=7;j++) {
			if(j<i-1) {
				System.out.print(" ");
			}else {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
	
}
}
