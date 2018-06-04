import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player {
	private int lives;
	private int xAxis;
	private int yAxis;
	private int xAxis_of_evil;
	private int yAxis_of_evil;
	private String imagePath;
	private boolean isAlive;
	
	//getters and setters
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		if(imagePath==null)
			JOptionPane.showMessageDialog(null, "Invalid string !");
		else if(imagePath.length()==0)
			JOptionPane.showMessageDialog(null, "String Empty !");
		else
		this.imagePath = imagePath;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
    //Constructors
	public Player(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive) {
		super();
		this.setLives(lives);
		this.setxAxis(xAxis);
		this.setyAxis(yAxis);
		this.setImagePath(imagePath);
		this.setAlive(isAlive);
	}
	
	public void drawPlayer(Graphics g) {
		ImageIcon img = new ImageIcon(imagePath);
		g.drawImage(img.getImage(), xAxis, yAxis, null);
		}
	public int getxAxis_of_evil() {
		return xAxis_of_evil;
	}
	public void setxAxis_of_evil(int xAxis_of_evil) {
		this.xAxis_of_evil = xAxis_of_evil;
	}
	public int getyAxis_of_evil() {
		return yAxis_of_evil;
	}
	public void setyAxis_of_evil(int yAxis_of_evil) {
		this.yAxis_of_evil = yAxis_of_evil;
	}
	

}
