package PART_II_OOP.Day35.Encapsulation;

public class RoulettePocket {

	private int pocketNumber;
		
	
	public RoulettePocket(int pocketNumber) {
		this.pocketNumber = pocketNumber;
	}

	
	public String getRouletteColor() {
		if(pocketNumber==0) {
			return "Green";
		}else if(pocketNumber>=1 && pocketNumber<=10) {
			if(pocketNumber%2==0) {
				return "black";
			}else {
				return "red";
			}
		}else if(pocketNumber>=11 && pocketNumber<=18) {
			if(pocketNumber%2==0) {
				return "red";
			}else {
				return "black";
			}
		}else if(pocketNumber>=19 && pocketNumber<=28) {
			if(pocketNumber%2==0) {
				return "black";
			}else {
				return "red";
			}
		}else if(pocketNumber>=29 && pocketNumber<=36) {
			if(pocketNumber%2==0) {
				return "red";
			}else {
				return "black";
			}
		}else
			return "invalid";
	}

	
	public void setpocketNumber(int pocketNumber) {
		if(pocketNumber<0 || pocketNumber>36) {
			this.pocketNumber =999;
		}else {
			this.pocketNumber = pocketNumber;
		}
	}

	public int getpocketNumber() {
		return pocketNumber;
	}

	public String toString() {
		return "RoulettePocket [pocketNumber=" + pocketNumber + "]";
	}


}
