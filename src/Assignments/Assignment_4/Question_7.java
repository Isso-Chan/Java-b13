package Assignments.Assignment_4;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=86402;
		int min=0, hour=0, seconds=0, day=0;
		
		if (number<60) {
			System.out.println("Number is " + seconds);
			
		} else if (number>60 && number<3600) {
			min=(number/60);
			seconds=number-(min*60);
			System.out.println("Number is " +min + " minutes and " +seconds + " seconds");
						
		} else if (number>=3600 && number<86400) {
			hour=(number/3600);
			min=(number-hour*3600)/60;
			seconds=(number-hour*3600)%60;
			System.out.println("Number is " + hour + " hours " + min + " minutes and " +seconds + " seconds");
			
		} else if (number>=86400) {
			day=number/86400;
			hour=(number/3600);
			min=(number-hour*3600)/60;
			seconds=(number-hour*3600)%60;
			System.out.println("Number is " + day + " days "+ hour + " hours " + min + " minutes and " +seconds + " seconds");
		}
		
		
	}

}
