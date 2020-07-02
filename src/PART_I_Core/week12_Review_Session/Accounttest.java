package PART_I_Core.week12_Review_Session;

public class Accounttest {

	public static void main(String[] args) {
		
		// array of object
		// Unlike traditional array thats store values like String, int, boolen
		// array objects store Objects. The array elements store the location of the reference variable of the object

		Account  obj[]= new Account[2];
		
		obj[0] = new Account();
		
		obj[1] = new Account();
		
		// when there is a class, how u can call the method belong to that class
		// refereneVariable.methodname
		
		obj[0].setData(1, 2);  // setData Account diye açtığımız diğer dosyada
		obj[1].setData(3, 4);
		
		System.out.println("For Array Element 0");
		obj[0].showData();
		
		System.out.println("For Array Element 1");
		obj[1].showData();
		
		
		
		
		

	}

}
