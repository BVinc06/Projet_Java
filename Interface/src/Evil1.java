import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JOptionPane;

public class Evil1 extends Player implements Runnable{
	
	private Level1 Level1;
	Random random = new Random();
	public int xdirection=1;
	public int ydirection = 2;
	private Player lorann;

	public Evil1(int lives, int xAxis, String imagePath, boolean isAlive, Level1 Level1, Player lorann) {
		super(lives, xAxis, xAxis, imagePath, isAlive);
		this.Level1 = Level1;
		this.lorann = lorann;

	}
	
	public void kill() {
		Rectangle lorannRect = new Rectangle(lorann.getxAxis(),lorann.getyAxis(),25,25);
		Rectangle evilRect = new Rectangle(this.getxAxis(),this.getyAxis(),25,25);
		//System.out.println("Evil's X :"+getxAxis());
		//System.out.println("Evil's Y :"+getyAxis());
		//System.out.println("Lorann's X :"+getxAxis());
		//System.out.println("Lorann's Y :"+getyAxis());
		if(lorannRect.intersects(evilRect)) {
			lorann.setxAxis(getxAxis()+3000000);
			lorann.setyAxis(getyAxis()+3000000);
			JOptionPane.showMessageDialog(null, "You died !");
			System.exit(0);
		}
	}
	

	@Override
	public void run() {
		while (true) {
		 try {
			 Thread.sleep(15);
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, "Thread interrupted");
			 System.exit(1);
		 }
		 
		 if(getxAxis() <= 0) {
			 xdirection = 1;
			 setImagePath("img//monster_1.png");
		 }
		 else if(getxAxis() >= (Level1.widthofscene - 30)) {
			 xdirection = -1;
			 setImagePath("img//monster_2.png");
		 }
		 else if(getyAxis() <= 0) {
			 ydirection = 2;
			 setImagePath("img//monster_3.png");
		 }
		 else if(getyAxis() >= (Level1.heightofscene - 30)) {
			 ydirection = -2;
			 setImagePath("img//monster_4.png");
		 }
		 
		 kill();
		 setxAxis(getxAxis() + 2 *xdirection);
		 setyAxis(getyAxis() + 2 *ydirection);
		 Level1.repaint();
		 
		 }
		
	}


}