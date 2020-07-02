package PART_II_OOP.Day44_OOPPractice.CallCenter;

public abstract class MessagingApp {

	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE="Messenger";
	
	public MessagingApp() {
		System.out.println("MessagingApp no-args constructor....");
	}
	public MessagingApp(String name, int count) {
		this.name=name;
		this.count=count;
	}
	
	public abstract void sendMessage(String msg);
	
	public void launch() {
		System.out.println("messaging App is launching...");
	}
	
	public static void close() {
		System.out.println("messaging App is closing...");
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		MessagingApp.count = count; // class name yazıldı(static olduğundan)--> this. yerine 
	}
	
	
	
}
