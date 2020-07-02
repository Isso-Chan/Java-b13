package Assignments.Assignment_5;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int house, player;

				house = 20;
				player = 21;
				if (player == 21) {
					if (house < player) {
						System.out.println("player's score is = " + player);
						System.out.println("house's score is = " + house);
						System.out.println("Result = Bust");
					} else {
		
						System.out.println("player's score is = " + player);
						System.out.println("house's score is = " + house);
						System.out.println("Result = impossible");						
					}
		
				} else if (player > house) {

					System.out.println("player's score is = " + player);
					System.out.println("house's score is = " + house);
					System.out.println("Result = Player wins");
		
				} else if (player < house) {
		
					System.out.println("player's score is = " + player);
					System.out.println("house's score is = " + house);
					System.out.println("Result = Player loses");
		
				} else if (player == house) {
		
					System.out.println("player's score is = " + player);
					System.out.println("house's score is = " + house);
					System.out.println("Result = It is a tie");
		
				}
		
	}

}
