package Assignments.Assignment_14.Q_12;

public class CameraPhone {

	int imageSize;
	int memorySize;
	
	public CameraPhone(int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures() {
		return memorySize*1000/imageSize;
	}
	
	
}
