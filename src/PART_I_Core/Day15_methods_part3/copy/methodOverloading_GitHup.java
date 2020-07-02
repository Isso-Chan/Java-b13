package PART_I_Core.Day15_methods_part3.copy;

import java.util.Scanner;

public class methodOverloading_GitHup {

	public static void main(String[] args) {
		
		Scanner sum=new Scanner(System.in);
		System.out.println("Enter 4 numbers: ");
		int num1=sum.nextInt();
		int num2=sum.nextInt();
		int num3=sum.nextInt();
		int num4=sum.nextInt();
		
		System.out.println(sum(num1,num2,num3));  
		
		int x = sum(num1, num2, num3, num4);
		System.out.println(x);

	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

}


/*
  
 
1- Number of parameters
	add(int,int)
	add(int,int,int)
2-Data Type of Parameters
	add(int,int)
	add(int,float)
	
3- Sequence of data type parameters
	add(int,float)
	add(float,int)
	
4- Invalid Case - not overloading
	int add(int,int)
	float add(int,int)
	
*/