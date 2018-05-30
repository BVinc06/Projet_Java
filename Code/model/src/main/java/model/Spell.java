package model;

public class Spell {
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGTH = 40;
	private static String IMAGE = "spell";
	private int distanceTraveled = 0;
	
	public Spell (Direction direction, Dimension dimension) {
		
	}
	
	public int getWidthADirection(Direction direction) {
		return distanceTraveled;
		
	}
	
	public int getHeightWithADirection(Direction direction) {
		return distanceTraveled;
		
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		return false;
		
	}
	
	public boolean hit() {
		return false;
		
	}

}
