package PART_I_Core.day05_weeklyReview.copy;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=70;
		boolean resl=(score>80) && (score<90); //  F &&......
		
		int min=50;
		boolean res2=score<min/2-10 | score>90;
		// score<((min/2)-10) || score>90;
		if (!res2)
			System.out.println("werttyyyy");
		
//		if((score & min)<20) {
//			System.out.println(true);
//			System.out.println(score);
//		}
		
	}

}
