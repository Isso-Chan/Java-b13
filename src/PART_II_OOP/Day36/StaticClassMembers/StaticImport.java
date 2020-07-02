package PART_II_OOP.Day36.StaticClassMembers;

import static java.lang.Math.*; // import all methods and properties belongs to Math class

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(16)); // yukarıda STATIC import ettiğimizden burada MATH diye class adı yazmaya gerek yok
		
		System.out.println(PI);
	}
}
