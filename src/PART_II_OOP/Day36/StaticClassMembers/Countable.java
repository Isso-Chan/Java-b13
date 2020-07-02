package PART_II_OOP.Day36.StaticClassMembers;

public class Countable {

	static int instanceCount;

	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
}
