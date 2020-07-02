package PART_I_Core.day08_controlFlowStatements_Part2;

public class Task36_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,result=0;
		String operator=" ";
		a=10; b=5; 
		switch (operator) {
		
		case "+":
			result=a+b;
			break;
						
		case "-":
			result=a-b;
			break;
			
		case "*":
			result=a*b;
			break;	
			
		case "/":
			result=a-b;
			break;
		default:
			System.out.println("Invalid Operator");
			break;
					
		}
		System.out.println("Result is " +result );
			
	}

}
