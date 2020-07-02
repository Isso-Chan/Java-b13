package PART_I_Core.day05_Unary_Assignment_relations.copy;

public class Task20_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int result=-a-- + a++ / -a-- * --a;
		// a in memory: 1 -> 0 -> 1 - >0 -> -1
		// result     : -1 + 0 / -1 * -1 => -1 +0 * -1 => -1 +0 => -1
		
		System.out.println("a= " + a);
		System.out.println("result = " + result);
	}

}
