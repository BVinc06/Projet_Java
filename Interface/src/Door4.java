import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JOptionPane;

public class Door4 extends Player implements Runnable{
	
	
	private Level4 Level4;
	
	public int xdirection=0;
	public int ydirection = 0;
	private Player lorann;
	public Evil4 Evil4;

	public Door4(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive,Level4 Level4, Player lorann) {
		super(yAxis, yAxis, yAxis, imagePath, isAlive);	
		this.Level4 = Level4;
		this.lorann = lorann;
	}
	
	public void imgchgt() {
		this.setImagePath("img//gate_open.png");
	}
	
	public void door() {
		Rectangle lorannRect = new Rectangle(lorann.getxAxis(),lorann.getyAxis(),25,25);
		Rectangle doorRect = new Rectangle(this.getxAxis(),this.getyAxis(),25,25);
		if(Crystal.TG == 0 && lorannRect.intersects(doorRect)) {
			lorann.setxAxis(getxAxis()+3000000);
			lorann.setyAxis(getyAxis()+3000000);
			JOptionPane.showMessageDialog(null, "You died !");
			System.exit(0);
		}
		if(Crystal.TG == 1 && getImagePath() == "img//gate_open.png") {
			
		}
		if(Crystal.TG == 1) {
			this.setImagePath("img//gate_open.png");
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
		 door();
		 Level4.repaint();
}}
	


	private static void repaint() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}