package PART_II_OOP.Day43.Polymorphism;

public class Testmethod {

	public static void main(String[] args) {
	
		ChildA chA=new ChildA();
		chA.m1();
		chA.m2();
		chA.m3();
		
		ChildB chB=new ChildB();
		chB.m1();
		chB.m2();
		chB.m4();
		
		parent p1=new ChildA();//poly
		p1.m1();
		
		parent p2=new ChildB();//polly
		p2.m1();
		
		MyInterface int1=new ChildA();
		int1.m2();
//		int1.m3();//HATA. Interface de yok, override edilmemiş
		
		MyInterface int2=new ChildB();
		int2.m2();// in child
		

	}

}

class parent{
	public void m1() {}
}

interface MyInterface{
	void m2();
}

class ChildA extends parent implements MyInterface{
	public void m2() {}
	public void m3() {}
}
class ChildB extends parent implements MyInterface{
	public void m2() {}
	public void m4() {}
}