package Assignments.Assignment_14.Q_13;

import java.util.Arrays;

public class Color {

	private int[] rgb=new int[3];
	int r,g,b;
		
	public final static int[] WHITE     = new int[]{255, 255, 255};    
	public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};    
	public final static int[] GRAY      = new int[]{128, 128, 128};    
	public final static int[] DARK_GRAY  = new int[]{64, 64, 64};    
	public final static int[] BLACK     = new int[]{0, 0, 0};    
	public final static int[] RED       = new int[]{255, 0, 0};    
	public final static int[] PINK      = new int[]{255, 175, 175};    
	public final static int[] ORANGE    = new int[]{255, 200, 0};    
	public final static int[] YELLOW    = new int[]{255, 255, 0};    
	public final static int[] GREEN     = new int[]{0, 255, 0};    
	public final static int[] MAGENTA   = new int[]{255, 0, 255};    
	public final static int[] CYAN      = new int[]{0, 255, 255};    
	public final static int[] BLUE      = new int[]{0, 0, 255};
	
	private final int[][] basicColors=new int[][] {WHITE, LIGHT_GRAY, GRAY, DARK_GRAY, BLACK, RED, PINK, ORANGE, YELLOW, GREEN, MAGENTA,CYAN, BLUE};
	
			
	public Color() {
		this.rgb=WHITE;
	}

	public Color(int r, int g, int b) {
		this();
		this.rgb = new int[] {r,g,b};
	}

	@Override
	public String toString() {
		
		String colorOfArray="n/a";
		for(int i=0;i<basicColors.length;i++) {
			if(Arrays.equals(this.rgb, basicColors[i])){
				colorOfArray=nameOfColor(i);
				break;
			}
		}
		return colorOfArray;
	}
	
	public String nameOfColor(int index) {
		String color="n/a";
		switch (index) {
		case 0: color="white"; break;
		case 1: color= "light gray"; break;
		case 2: color= "gray"; break;
		case 3: color= "dark gray"; break;
		case 4: color= "black"; break;
		case 5: color= "red"; break;
		case 6: color= "pink"; break;
		case 7: color= "orange"; break;
		case 8: color= "yellow"; break;
		case 9: color= "green"; break;
		case 10: color= "magenta"; break;
		case 11: color= "cyan"; break;
		case 12: color= "blue"; break;
		}
		return color;
	} 
	
	
	
	
	
	
	
	
	
}

