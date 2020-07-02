package Assignments.Assignment_14.Q_6;

public class ParkingMeter {

	int timeLeft=0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	public boolean add(int time) {
		boolean increase=false;
		if(timeLeft<=maxTime && time==25) {
			timeLeft+=30;
			increase=true;
		}
		return increase;
	}
	
	public void tick() {
		if(timeLeft>0) {
			timeLeft-=1;
		}
	}
	
	public boolean isExpired() {
		boolean exp=false;
		if (timeLeft==0) {
			exp=true;
		}
		return exp;
	}
}
