import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JOptionPane;

public class Spell2 extends Player implements Runnable{
	
	public static boolean A = false;
	private Level2 Level2;
	Random random = new Random();
	public int xdirection=0;
	public int ydirection = 0;
	private Player lorann;
	public Evil2 Evil2;
	private String tablecolor[] = new String[5]; 

	public Spell2(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive, Level2 level2, Player lorann, Evil2 Evil2) {
		super(lives, xAxis, xAxis, imagePath, isAlive);
		this.Level2 = level2;
		this.lorann = lorann;
		this.Evil2= Evil2;
		
	}
	
	public void kill() {
		Rectangle lorannRect = new Rectangle(lorann.getxAxis(),lorann.getyAxis(),25,25);
		Rectangle spellRect = new Rectangle(this.getxAxis(),this.getyAxis(),25,25);
		Rectangle evilRect = new Rectangle(Evil2.getxAxis(),Evil2.getyAxis(),25,25);
		if(lorannRect.intersects(spellRect)) {
			A=false;
			Level2.B =true;
			Level2.Fire=true;
			//System.out.println("ciao");
			this.setxAxis(getxAxis()+3000000);
			this.setyAxis(getyAxis()+3000000);
		}
		if(evilRect.intersects(spellRect)) {
			//System.out.println("ciao");
			Evil2.setxAxis(getxAxis()+3000000);
			Evil2.setyAxis(getyAxis()+3000000);
		}
}
	
	@Override
	public void run() {
		while (true) {
			for (int i = 0; i<5; i++) {
		 try {
			 Thread.sleep(10);
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, "Thread interrupted");
			 System.exit(1);
		 }
		 
		 tablecolor[0]=("img//fireball_1.png");
		 tablecolor[1]=("img//fireball_2.png");
		 tablecolor[2]=("img//fireball_3.png");
		 tablecolor[3]=("img//fireball_4.png");
		 tablecolor[4]=("img//fireball_5.png");
		
		 if(Level2.directionx ==1 && A==false && Level2.B==false) {
			 this.setxAxis(lorann.getxAxis()+40);
			 this.setyAxis(lorann.getyAxis());
			 //System.out.println("hello");
			 xdirection = 1;
			 ydirection = 0;
			 Level2.repaint();
			 A=true;
			 //setImagePath("img//fireball_4.png");
		 }
		 else if(Level2.directionx==0 && A==false && Level2.B==false) {
			 this.setxAxis(lorann.getxAxis()-40);
			 this.setyAxis(lorann.getyAxis());
			 xdirection = -1;
			 ydirection = 0;
			 Level2.repaint();
			 A=true;
			 //setImagePath("img//fireball_4.png");
		 }
		 else if(Level2.directiony==1 && A==false && Level2.B==false) {
			 this.setyAxis(lorann.getyAxis()-40);
			 this.setxAxis(lorann.getxAxis());
			 xdirection = 0;
			 ydirection = -1;
			 Level2.repaint();
			 A=true;
			 //setImagePath("img//fireball_4.png");
		 }
		 else if(Level2.directiony==0 && A==false && Level2.B==false) {
			 this.setyAxis(lorann.getyAxis()+40);
			 this.setxAxis(lorann.getxAxis());
			 xdirection = 0;
			 ydirection = 1;
			 Level2.repaint();
			 A=true;
			 //setImagePath("img//fireball_4.png");
		 }
		 else if(getxAxis() <= 0 ) {
			 xdirection = 1;	 
		 }
		 else if(getxAxis() >= (Level2.widthofscene- 50) ) {
			 xdirection = -1;
		 }
		 else if(getyAxis() <= 0 ) {
			 ydirection = 1;
		 }
		 else if(getyAxis() >= (Level2.heightofscene - 70) ) {
			 ydirection = -1;
 		 }
 		
		 kill();
		 this.setImagePath(tablecolor[i]);
		 this.setxAxis(getxAxis() + 2 *xdirection);
		 this.setyAxis(getyAxis()+ 2*ydirection);
		 Level2.repaint();
		 }
		}
		
	}

	private static void repaint() {
		// TODO Auto-generated method stub
		
	}
}