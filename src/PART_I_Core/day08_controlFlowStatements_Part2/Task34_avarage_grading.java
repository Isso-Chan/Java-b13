package PART_I_Core.day08_controlFlowStatements_Part2;

public class Task34_avarage_grading {

	public static void main(String[] args) {
		// The marks obtained by a student in 3 different subjects are input by the user. Your
		//program should calculate the average of subjects. The student gets a grade as per the
		//following rules:

		int math=100;
		int chemistry=70;
		int biology=90;
		
		double avarage=(math+chemistry+biology)/3;
		System.out.println("Avarage is " + avarage);

		if(avarage>=0 && avarage<=59) {
			System.out.println("Grade is F");
		}else if (avarage>=60 && avarage<=69) {
			System.out.println("Grade is D");
		}else if (avarage>=70 && avarage<=79) {
			System.out.println("Avarage is C");
		}else if (avarage>=80 & avarage<=89) {
			System.out.println("Avarage is B");
		}else if (avarage>=90 && avarage<=100) {
			System.out.println("Avarage is A");
		}
	}

}
