import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JOptionPane;

public class Crystal extends Player implements Runnable{
	
	
	private Level1 Level1;
	
	public int xdirection=0;
	public int ydirection = 0;
	private Player lorann;
	public Evil1 Evil1;
	public static int TG = 0;

	public Crystal(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive,Level1 Level1, Player lorann) {
		super(yAxis, yAxis, yAxis, imagePath, isAlive);	
		this.Level1 = Level1;
		this.lorann = lorann;
	}
	
	public void buble() {
		Rectangle lorannRect = new Rectangle(lorann.getxAxis(),lorann.getyAxis(),25,25);
		Rectangle crystalRect = new Rectangle(this.getxAxis(),this.getyAxis(),25,25);
		if(lorannRect.intersects(crystalRect)) {
			this.setxAxis(getxAxis()+3000000);
			this.setyAxis(getyAxis()+3000000);
			TG += 1;
	
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
		 buble();
		 Level1.repaint();
}}
	


	private static void repaint() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}