package PART_I_Core.Week05_Review_session_If_Statements;

public class ifElseIf_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get student grade from user
		// 90-100 "A"
		//80-89 "B"
		// 70-79 "C"
		//60-69 "D"
		// less then 60 "F"
		
		int grade=70;
		
		if (grade>=90 && grade<=100) {
			System.out.println("Grade is : A");
		} 
		if (grade>=80 && grade<=89) {
			System.out.println("Grade is : B");
		}
		if (grade>=70 && grade<=79) {
			System.out.println("Grade is : C");
		}
		if (grade>=60 && grade<=69) {
			System.out.println("Grade is : D");
		}
		if (grade<60) {
			System.out.println("Grade is : F");
		}
		
		// ONEMLIDIR. Else if ornegi- yukaridaki ile ayni seyi yapiyor.
		
		if (grade>=90 && grade<=100) {
			System.out.println("Grade is : A");
			
		} else if (grade>=80) {
			System.out.println("Grade is : B");
		} else if (grade>=70) {
			System.out.println("Grade is : C");
		} else if (grade>=60) {
			System.out.println("Grade is : D");
		} else if (grade<60) {
			System.out.println("Grade is : F");
		} else {
			System.out.println(" wassss?");
		} 
	}

}
