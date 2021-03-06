package PART_II_OOP.Day46_colections_Part1;

public class Product implements Comparable<Product>{

	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

//	this method returns an int of 3 types
//	1. Positive number-> this product is larger than another product
//	2. zero-> if this and an other product are equal
//	3. negative-> This product is smaller than an other
	@Override
	public int compareTo(Product anotherProduct) {
		if(this.price>anotherProduct.price) {
			return 1;
		}else if (this.price== anotherProduct.price) {
			return 0;
		}else {
			return -1;
		}
	}
	
	
	
}
