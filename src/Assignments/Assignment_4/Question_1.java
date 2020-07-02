package Assignments.Assignment_4;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int massPound=130;
		int feetHeight=5, inchHeight=2;
		double cmHeight=(inchHeight*0.0254)+(feetHeight*30.48);
		int massKg=(int)(massPound/2.2);
		
		double BMI=(massKg)/((cmHeight/100)*(cmHeight/100));
		
		if (BMI<18.5) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet " + feetHeight + " and inches " + inchHeight);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factor is Underweight");
		}
		if (BMI>18.5 && BMI<25) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet " + feetHeight + " and inches " + inchHeight);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factor is Normal Weight");
		}
		if (BMI>=25 && BMI<30) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet " + feetHeight + " and inches " + inchHeight);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factor is Overweight");
		}
		if (BMI>=30) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet " + feetHeight + " and inches " + inchHeight);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factor is Obese");
		}
	}

}
