package PART_II_OOP.Day37_Inheritance.Task1;

public class FinalExam extends GradeActivity{

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		this.numQuestions=numQuestions;
		this.numMissed=numMissed;
		
		pointsEach=100.0/numQuestions;
		numericScore=100.0-(numMissed*pointsEach);
		
		setScore(numericScore); // score=numericScore deyince hatalı oluyor. Çünkü variable score
//		 in GradeActivity is PRIVATE. So we call it by setter Method and assign it score.
		
	}
	
}
