package Assignments.Assignment_14.Q_14;

public class Item {

	private String name;
	private int quantity;
	private int catalogNumber;	
	private double price;
	
	public Item(String name, int quantity, int catalogNumber,  double price) {
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Regular Item {name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price=" + price
				+ "}";
	}
}
