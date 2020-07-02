package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_09_swappingName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("input E-Mail: ");
		String email=sc.next();
		
		String name="";
		String lastname="";
		String dummy="";
		int sepIndex=0;
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='_') {
				sepIndex=i;
			}			
			if(email.charAt(i)=='@') {
				break;			
			}
		}
		
		if(sepIndex!=0) {
			String[] seperated2= email.split("@");
			String[] subseperated=seperated2[0].split("_");
			System.out.println(subseperated[1]+"_"+subseperated[0]+"@"+seperated2[1]);
		}else
			System.out.println(email);
		
		
	}

}
