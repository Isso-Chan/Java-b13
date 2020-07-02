package PART_I_Core.day07_ifStatements.copy;

public class ifStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=80;
		
		if (score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
		}
		
		System.out.println("*************************");
		
		int sales, bonus;
		double commissionRate,salary;
		
		sales=5000;
		salary=10_000;
		
		if (sales>5000) {
			bonus=500;
			commissionRate=1.12;
			
			salary=salary*commissionRate+bonus;
		}
		System.out.println("Salary = " + salary);
	}

}
