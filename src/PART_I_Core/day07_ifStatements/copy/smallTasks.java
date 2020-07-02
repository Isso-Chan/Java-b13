package PART_I_Core.day07_ifStatements.copy;

public class smallTasks {

	public static void main(String[] args) {
		// write an if Statement  that assigns 5 to x when yis equal to 20

		int x, y;
		x=0;
		y=20;
		
		if(y==20) {
			x=5;			
		}
		
		System.out.println("x= " + x + " y= " + y);
		
		//2-Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
		
		double payRate=1000, hours=40;
		if (hours>40) {
			payRate=payRate*1.5;				
		}
		System.out.println("Payrate is " + payRate);
		
		//3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
		
		boolean max=true;
		int fee=20;
		if (max==true) {
			fee=50;
		}
		System.out.println("Fee is " + fee);
		
		//4 write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater 
		// and equal to 100
		int a=100, b=20, c=30;
		
		if(b==50 && c>=30) {
			a=20;
		}
		System.out.println("a is " + a);
		
		//5_Write an if statement that prints "Ideal temp" is between 70 and 80;
		int temp=75;
		if(temp>70 && temp<80) {
			System.out.println("Ideal Temp ");
		}
		
		
	}

}
