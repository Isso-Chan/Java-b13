package Assignments.Assignment_14.Q_3;

public class Db {

	private String data;
	private int yint;
	
	
	public void insertData(String str, int a) {
		setData(str);
		setYint(a);
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public int getYint() {
		return yint;
	}


	public void setYint(int yint) {
		this.yint = yint;
	}
	
	
	public static void main(String[] args) {
		
		Db db=new Db();
		db.insertData("aaa", 123);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		System.out.println("----------");
		db.setData("zzz");
		db.setYint(200);
		System.out.println(db.getData());
		System.out.println(db.getYint());
	}
	
}
