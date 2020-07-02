package PART_I_Core.Day23_stringManipulation_lab3.copy;

public class Question_17 {

	public static void main(String[] args) {
		// Write a method that accepts a string
//		and returns true if the string is
//		palindrome

		String str="madam";
		int num=str.length();
		String dummy="";
		
		for(int i=num-1;i>=0;i--) {
			dummy=dummy+str.charAt(i);
		}
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ",""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	
//		int count=0;
//		boolean palindrom=true;
//		for(int i=0;i<num/2;i++) { // tersten kelimeyi charAt() ile okutup, dummy degiskene atayip
////			kelimeyi tersten olustur. Sonra ilk hali ile karsilastir.
//			
//			if(!str.substring(i,i+1).equals(str.substring(num-1-i,num-i))) {
//				palindrom=false;
//				break;
//			}
//		}
//		System.out.println(palindrom);
	}

}
