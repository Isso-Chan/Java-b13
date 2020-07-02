package Assignments.Assignment_5;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=45678;
		int prompt1, prompt2, prompt3, prompt4, prompt5;
		
		if (number>= 10000 && number<=99999) {
			prompt1=(number/10000);
			System.out.println("Display prompt:" + prompt1);
			prompt2=(number-prompt1*10000)/1000;
			System.out.println("Display prompt:" + prompt2);
			prompt3=(number-(prompt1*10000)-(prompt2*1000))/100;
			System.out.println("Display prompt:" + prompt3);
			prompt4=(number-(prompt1*10000)-(prompt2*1000)-(prompt3*100))/10;
			System.out.println("Display prompt:" + prompt4);
			prompt5=(number-(prompt1*10000)-(prompt2*1000)-(prompt3*100)-(prompt4*10))%10;
			System.out.println("Display prompt:" + prompt5);
		}
	}

}
