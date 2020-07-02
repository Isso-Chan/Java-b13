package PART_I_Core.Day16_Pbjects_and_Classes.copy;

public class Phones {

	public static void main(String[] args) {
		
		cellPhone cell1=new cellPhone();
			
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		
		cell1.brand="Iphone";
		cell1.color="Grey";
		cell1.price=76.16;
		cell1.screenSize=5.5;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		
		cell1.color="Black";
		System.out.println(cell1.color);
		
		
		cellPhone cell2= new cellPhone();
		cell2.brand="Siemens";
		cell2.screenSize=1.5;
		cell2.color="Red";
		cell2.price=39.22;
		
		System.out.println("## CELL 2 VALUES###");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Screen Size: " +cell2.screenSize);
		System.out.println("Color: "+cell2.color);
		System.out.println("Price: "+cell2.price);
		
		System.out.println("#####Calling Methods####");
		
		cell1.call();
		cell1.message();
		cell1.takePhoto();
		
		cell2.call();
		cell2.message();
		cell2.takePhoto();
		

		
		

	}

}
