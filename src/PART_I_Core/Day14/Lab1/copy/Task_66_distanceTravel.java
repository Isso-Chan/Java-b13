package PART_I_Core.Day14.Lab1.copy;

public class Task_66_distanceTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distance=sum(60,5);
		System.out.println("Distance travelled is "+distance);
	}

	private static double sum(int speed, int time) {
		double distanceTravelled=speed*time;
		return distanceTravelled;
	}

}
