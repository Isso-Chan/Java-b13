package a_SampleInterviewQuestions;

public class KumSaatiSeklindeYazdirma2 {
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
		for(int k=1;k<i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++) {
			System.out.print(j+" ");
		}
		
			System.out.println();
	}
	for(int i=6;i>=1;i--) { //satır sayısı 1 azalmış!!
		for(int k=1;k<i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
