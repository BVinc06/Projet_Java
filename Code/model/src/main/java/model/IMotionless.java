package model;

import java.awt.Image;
import java.awt.Point;

public interface IMotionless {
	public Point getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public Image getImage();
	public void placeInArea(IArea area);
	public void setLorannModel(LorannModel lorannModel);
}
