package Assignments.Assignment_14.Q_8;

public class Value {

	int countSet=0, countCons=0;
	int ConsValue, Setvalue;
	
	public Value(int a) {
		this.ConsValue=a;
		countCons=1;
	}
	
	public Value() {}
	
	public void setVal(int s) {
		countSet=1;
		this.Setvalue=s;
	}
	
	public boolean wasModified() {
		if(countSet==1) {
			return true;
		}else 
			return false;
	}
	public int getVal() {
		int x=0;
		if(wasModified()) {
			x=Setvalue;
		}else if(countCons==1) {
			x=ConsValue;
		}
		return x;
	}
}
