package model;

import java.awt.Image;
import java.awt.Point;

public class Mobile {
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
	}
	
	public Direction getDirection() {
		return null;
	}
	
	public void setDirection(Direction direction) {	
	}
	
	public int getSpeed() {
		return speed;
	}

	public Point getPosition() {
		return null;
	}
	
	public Dimension getDimension() {
		return null;
	}
	
	public int getWidth() {
		return 0;
	}
	
	public int getHeight() {
		return 0;
	}
	
	public void move(){
	}
	
	public void moveUp(){
	}

	public void moveDown(){
	}
	public void moveRight(){
	}
	public void moveLeft(){
	}
	
	public void placeInArea(IArea area) {
	}
	
	public Image getImage() {
		return null;
	}
	
	public ILorannModel getLorannModel() {
		return null;
	}
	
	public void setLorannModel(ILorannModel lorannModel) {
	}

	public ILorannModel getLorannModel() {
	}
	
	public boolean hit() {
		return false;
	}
	
	public boolean isSpell() {
		return false;
	}
	
	public Image getImage() {	
	}
}