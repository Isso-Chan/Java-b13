package PART_I_Core.Day17_classObject_Part2.copy;

public class carObjects {

	public static void main(String[] args) {
 
		BMW b1=new BMW();
		BMW b2=new BMW();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make="BMW2345";
		
		System.out.println(b1.make);
		System.out.println(b1.model);
		
		b2.model="x3";
		b2.showprice();

	}

}
