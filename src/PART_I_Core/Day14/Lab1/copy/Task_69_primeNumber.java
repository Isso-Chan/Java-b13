package PART_I_Core.Day14.Lab1.copy;

public class Task_69_primeNumber {

	public static void main(String[] args) {
		
		boolean result=primeNumber(21);
		System.out.println(result);
	}

	private static boolean primeNumber(int num) {
		boolean answer=true;
		loop:
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				answer=false;
				break loop;
			}
		}
		return answer;
	}

	
}
