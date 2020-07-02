package PART_I_Core.Week09_Review_String;

public class string_Equals {

	public static void main(String[] args) {
		
		String s1="Welcome to Java";
		String s2="Welcome to Java";
		String s3=new String("Welcome to Java");
		
		System.out.println(s1==s2); //true same objects
		System.out.println(s1==s3); // false different objects
		
		System.out.println(s1.equals(s2)); // same values
		System.out.println(s1.equals(s3)); // same values
		

		System.out.println(s1.length());
		System.out.println(s1.substring(11,15));
		
		System.out.println("====================");
		
		
		// How to get a particular substring
		String s4="The best Java core course in Europe is Cybertek. End of Story";
		String myTarget="Europe";
		
		int index1=s4.indexOf(myTarget);
		int index2=index1+myTarget.length();
				
		System.out.println(s4.substring(index1,index2));
		
		System.out.println("===================");
		
		
		// How to print all of a given string
		
		String str5="Cybertek";
		for(int i=0;i<=str5.length();i++) {
			for(int j=i+1;j<=str5.length();j++) {
				System.out.println(str5.substring(i,j));
			}
					
		}
	}

	}

