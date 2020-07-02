package PART_I_Core.Day14.Lab1.copy;

public class Question_4_deerPlay {
	public static void main(String[] args) {
/*The deers in VA spend most of the day playing. In particular, they play if the temperature is
 *  between 60 and 90. Unless it is summer, then the upper limit is 100 instead of 90.
Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.
deerPlay(70, false); - > true
deerPlay(95, false); - > false
deerPlay(95, true); - > true
 */ 	
//		boolean inSummer=false;
//		int temp=50;
		deerPlay(100,false);
		deerPlay(95,false);
		deerPlay(95,true);
	}

	private static void deerPlay(int temp, boolean inSummer) {
		if(inSummer==true && temp>=60 && temp<=90) {
			System.out.println(true);
		} else if (inSummer==false && temp>=60 && temp<=100) {
			System.out.println(true);
		} else
			System.out.println(false);
		
	}
	
}
 
