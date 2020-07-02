package Assignments.Assignment_13;

public class Q_80_batsmanScores {

	public static void main(String[] args) {
		
		short[] scores= {51,85,32,0,98,157,82,101,64,249};
		int half_century=0, century=0, d_century=0;
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=50 && scores[i]<100) {
				half_century++;
			}else if (scores[i]>=100 && scores[i]<200) {
				century++;
			}else if (scores[i]>=200 ) {
				d_century++;
			}
			
		}
		System.out.println("Number of Half centuries: "+half_century);
		System.out.println("Number of Centuries: "+century);
		System.out.println("Number of double-century: "+d_century);

	}

}
