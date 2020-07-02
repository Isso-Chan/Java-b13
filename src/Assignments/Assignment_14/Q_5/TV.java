package Assignments.Assignment_14.Q_5;

public class TV {
	
	private int channel=1;
	private int volumeLevel=1;
	boolean on = false;
	private String brand = "undefined";
	
	// Constructors 
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		this.brand=brand;
	}

	// getter-setters part
	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if(volumeLevel<7 && on==true) {
			this.volumeLevel = volumeLevel;
		}else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");	
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel>0 && channel<=120) {
			this.channel = channel;
		}else 
			System.out.println("ERROR: TV is either OFF or invalid Channel");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//Volume and channel change and TV status part
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void volumelUp() {
		if(volumeLevel<7 && on==true) {
			volumeLevel++;
		}else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	public void volumelDown() {
		if(volumeLevel>1 && on==true) {
			volumeLevel--;
		}else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	
	public void isOn() {
		if (on==true) {
			System.out.println("TV is already ON");
		}else
			System.out.println("TV is OFFFFFFF");
	}
	public void turnOn() {
			System.out.println("------Tv is now opened------");
	}
	public void turnOff() {
		if(on==false) {
			System.out.println("TV is already OFF");
		}else
			turnOn();
	}
}
