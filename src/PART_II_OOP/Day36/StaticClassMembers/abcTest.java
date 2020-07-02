package PART_II_OOP.Day36.StaticClassMembers;

public class abcTest {

	public static void main(String[] args) {
		
		ABC.m1();
		
//		ABC o1=new ABC(); // constructor is private
//		o1.m1();
		
		// whenever your methods are static, and you want everyone 
		// to call them static way(Classname.methodname), then you can simply make your constructor private
		
	}

	public static void print() {
		//static int a=5; // local values can not be static!!!!!
	}
}
