import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Level4 extends JPanel implements KeyListener {
	
	private static Thread Spell;
	public int widthofscene = 1287;
	public int heightofscene = 700;
	//private static final int xAxis_of_evil = 10;
	//private static final int yAxis_of_evil = 10;
	private JFrame window = new JFrame("Lorann - Level #4");
	private ImageIcon background = new ImageIcon("img//background.png");
	private Player player = new Player(5, 643, 350, "img//lorann_u.png",true);
	private Evil4 evil4 = new Evil4(20, 20, "img//monster_1.png", true, this, player) ;
	private Spell4 spell4 = new Spell4(0, -9000, -9000, "img//fireball_4.png", false, this, player, evil4);
	private Crystal4 crystal4 = new Crystal4(0, 20, 20, "img//crystal_ball.png", true, this, player);
	private Door4 door4 = new Door4(0, 900, 600, "img//gate_closed.png", true, this, player);
	private Purse4 purse4 = new Purse4(0, 1000, 450, "img//purse.png", true, this, player);
	public int directionx;
	public int directiony;
	public boolean Fire=true;
	public boolean B=true;
	

	public Level4() {
		this.setFocusable(true);
		this.addKeyListener(this);
		window.add(this);
		Thread thread = new Thread(evil4);
		Thread Spell = new Thread(spell4);
		Thread Crystal = new Thread(crystal4);
		Thread Door = new Thread(door4);
		Thread Purse = new Thread(purse4);
		Purse.start();
		Spell.start();
		thread.start();
		Crystal.start();
		Door.start();
		window.setSize(widthofscene, heightofscene);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);	
	}
	
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		player.drawPlayer(g);
		evil4.drawPlayer(g);
		spell4.drawPlayer(g);
		crystal4.drawPlayer(g);
		door4.drawPlayer(g);
		purse4.drawPlayer(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void keyPressed(KeyEvent ke) {
	switch (ke.getKeyCode()){

	case KeyEvent.VK_RIGHT :
		player.setxAxis(player.getxAxis() + 32);
		player.setImagePath("img//lorann_r.png");
		directionx = 1 ;
		directiony = 3 ;
		Break();
		this.repaint();
		break;
		
	case KeyEvent.VK_LEFT :
		player.setxAxis(player.getxAxis() - 32);
		player.setImagePath("img//lorann_l.png");
		directionx = 0;
		directiony = 3;
		Break();
		this.repaint();
		break;
		
	case KeyEvent.VK_UP :
		player.setyAxis(player.getyAxis() - 32);
		player.setImagePath("img//lorann_u.png");
		directiony = 1;
		directionx = 3;
		Break();
		this.repaint();
		break;
		
	case KeyEvent.VK_DOWN :
		player.setyAxis(player.getyAxis() + 32);
		player.setImagePath("img//lorann_b.png");
		directionx = 3 ;
		directiony = 0 ;
		Break();
		this.repaint();
		break;
	
	case KeyEvent.VK_SPACE :
		if(Fire==true) {
			spell4.setxAxis(player.getxAxis()+32);
			spell4.setyAxis(player.getyAxis()+32);
			spell4.setImagePath("img//fireball_4.png");
			Fire=false;
			B=false;
			}
		break;
	
	}
}


	private void setImagePath(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void Break() {
    	
    	if (player.getxAxis()>=this.getWidth()-30)
    	{
    		player.setxAxis(player.getxAxis()-32);
    	}else if (player.getxAxis()<=-5)
    	{
    		player.setxAxis(player.getxAxis()+32);
    	}else if (player.getyAxis()>=this.getHeight()-30)
    	{
    		player.setyAxis(player.getyAxis()-32);
    	}else if (player.getyAxis()<=-5)
    	{
    		player.setyAxis(player.getyAxis()+32);
    	}
    }

	public Crystal4 getCrystal() {
		return crystal4;
	}

	public void setCrystal(Crystal4 crystal) {
		this.crystal4 = crystal;
	}

}