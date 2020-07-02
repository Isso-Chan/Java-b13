package PART_I_Core.Day15_methods_part3.copy;

public class Task_69_primeNumber {

	public static void main(String[] args) {
		
		boolean result=isPrime(4);
		System.out.println(result);
	}

	private static boolean isPrime(int num) {
		boolean answer=true;
		if(num==0 || num==1) {
			return true;
		} else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					answer=false;
					break;
				}
			}
		}
		return answer;
	}


}
