package Assignments.Assignment_14.Q_14;

public class Test {

	public static void main(String[] args) {
		
		TJMaxx t1=new TJMaxx();
		TJMaxx t2=new TJMaxx();
		
		Item item1=new Item("Iso",	20, 1001, 99.9);
		Item item2=new Item("Lezzo", 5, 1002, 5.99);
		
		OnSaleItem o1=new OnSaleItem("kazak", 3, 1010, 3.49, 2);
		OnSaleItem o2=new OnSaleItem("yelek", 18, 2051, 16, 9.5);
				
		
		System.out.println(item1.getQuantity());
		System.out.println(o1.toString());
		System.out.println(t1.getAllItemNames());
	}

}
