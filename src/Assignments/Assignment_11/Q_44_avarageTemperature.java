package Assignments.Assignment_11;

public class Q_44_avarageTemperature {

	public static void main(String[] args) {
		
		double[] temps= {80, 88, 88, 84, 82, 78, 60, 68};

		double sum=0.0;
		for(double each: temps) {
			sum=sum+each;
		}
		System.out.println("Avarage temp: "+ (sum/temps.length));
	}

}
