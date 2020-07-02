package PART_II_OOP.Day34_constructors_passingObjectToMethod;
/*
 * 
 * Write a class with the name Calculator. 
 * The class needs two fields (instance variables) 
 * with name floor of type Floor and carpet of type Carpet.The class needs to have one constructor 
 * with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
 * 
 * Write the following methods (instance methods):
*  Method named getTotalCost without any parameters, 
*  it needs to return the calculated total cost to cover the floor with a carpet.
 */


public class Calculator {
	

	Floor floor;
	Carpet carpet;
	
	
	public Calculator(Floor fl, Carpet carp) { // Floor floor = new floor()
		this.floor = fl;
		this.carpet = carp;
	}
	
		
	public Calculator(Floor fl1) {
		this.floor = fl1;
	}



	public double getTotalCost() {
		
		return floor.getArea() * carpet.getcost();
	}
	
	public double getSumArea(Floor f1, Floor f2) {
		return f1.getArea()+f2.getArea();
	}
	
	
	

}
