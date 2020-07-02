package PART_I_Core.Day15_methods_part3.copy;

public class Task70_highScorePosition {

	public static void main(String[] args) {
		/* Create a method called displayHighScorePosition. It should have a players name as a
		parameter, and a 2nd parameter as a position in the high score table. You should
		display the players name along with a message like “managed to get into position”
		and the position they got and a further message “on the high score table”
		Create a 2nd method called calculateHighScorePosition. It should be sent one
		argument only., the player score. It should return an int. The return data should be :
		1 – if the score is >=1000
		2 – if the core is >=500 and <1000
		3- if the score is >=100 and <500
		4- in all other cases
		§ Call both methods and display the results of the following:
		a score of 1500, 900, 400 and 50  */

				String name="Mike";
			
				int position=calculateHighScorePosition(50);

				displayHighScorePosition(name,position);
				displayHighScorePosition("Tom",calculateHighScorePosition(500));
	}

	private static int calculateHighScorePosition(int i) {
				
		if (i>=1000) {
			return 1;
		}else if (i>=500 && i<1000) {
			return 2;
		} else if (i>=100 && i<500) {
			return 3;
		}else {
			return 4;
		} 
						
	}

	private static void displayHighScorePosition(String name, int position) {
		System.out.println(name+" managed to get into position "+position+" on the high score table");
			
	}

}
