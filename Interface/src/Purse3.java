import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JOptionPane;

public class Purse3 extends Player implements Runnable{
	
	
	private Level3 Level3;
	
	public int xdirection=0;
	public int ydirection = 0;
	private Player lorann;
	public Evil3 Evil3;
	//public static int TG2 = 0;

	public Purse3(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive,Level3 Level3, Player lorann) {
		super(yAxis, yAxis, yAxis, imagePath, isAlive);	
		this.Level3 = Level3;
		this.lorann = lorann;
	}
	
	public void bourse() {
		Rectangle lorannRect = new Rectangle(lorann.getxAxis(),lorann.getyAxis(),25,25);
		Rectangle bourseRect = new Rectangle(this.getxAxis(),this.getyAxis(),25,25);
		if(lorannRect.intersects(bourseRect)) {
			this.setxAxis(getxAxis()+3000000);
			this.setyAxis(getyAxis()+3000000);
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
		 bourse();
		 Level3.repaint();
}}
	


	private static void repaint() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}