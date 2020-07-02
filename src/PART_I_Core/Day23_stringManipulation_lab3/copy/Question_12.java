package PART_I_Core.Day23_stringManipulation_lab3.copy;

public class Question_12 {

	public static void main(String[] args) {
/*Return true if the string "cat" and "dog" appear the same number of times in the given
string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/		
		String str="catdog";    //counterCat
								//counterDog
								//substring(0,3)= i,i+3
		int counterCat=0, counterDog=0;
		
		for(int i=0;i<str.length()-2;i++) { //i<6=5
			
			if(str.substring(i,i+3).equals("cat")){
				counterCat++;
			}
			if(str.substring(i,i+3).equals("dog")){
				counterDog++;
			}
		}
		
		if(counterDog==counterCat) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
	
