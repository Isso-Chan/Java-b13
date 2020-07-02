package Assignments.day4;

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputSeconds, hours, seconds, minutes;
		inputSeconds=3695;
		
		hours=inputSeconds/(60*60);
		minutes=(inputSeconds-hours*60*60)/60;
		seconds=(inputSeconds-hours*60*60)%60;
		
		System.out.println(hours + " hours, " + minutes + " minutes " + seconds + " seconds");
	}

}
