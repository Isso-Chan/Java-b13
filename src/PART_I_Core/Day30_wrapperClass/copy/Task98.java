package PART_I_Core.Day30_wrapperClass.copy;

public class Task98 {

	public static void main(String[] args) {
		
		 String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	        System.out.println(decodeTheCode(str1));

	        
	     String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
	        System.out.println(decodeTheCode(str2));
		
		decodeTheCode(str1);
		decodeTheCode(str2);

	}

	private static String decodeTheCode(String str3) {
		String newArray="";
		for(int i=0;i<str3.length();i++) {
			if(Character.isLetter(str3.charAt(i)) || str3.charAt(i)==' ') {
				newArray=newArray+str3.charAt(i);
			}

		}
		String[] str4=newArray.split(newArray);
		for( String value: str4) {
			switch (value) {
			case "one": 
				System.out.println(1);
			}
		}
		return newArray;
	
	}

}
