package PART_I_Core.Day23_stringManipulation_lab3.copy;

public class Question_11 {

	public static void main(String[] args) {

		/*Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
//countHi("hihi") → 2*/
		
		System.out.println(countHi("abc hi hohi"));// 11
		System.out.println(countHi("abc hi hi hi"));
		
	}

	private static int countHi(String str) {
		int num=str.length(), count=0;
		
		for (int i=0;i<num-1;i++) {   // 9<10
			if(str.substring(i,i+2).equals("hi")) { // substring(9,11)--> hata verir
				count++;
			}
		}
		return count;
		
	}

}
