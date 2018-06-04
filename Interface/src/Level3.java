import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Level3 extends JPanel implements KeyListener {
	
	private static Thread Spell;
	public int widthofscene = 1287;
	public int heightofscene = 700;
	//private static final int xAxis_of_evil = 10;
	//private static final int yAxis_of_evil = 10;
	private JFrame window = new JFrame("Lorann - Level #3");
	private ImageIcon background = new ImageIcon("img//background.png");
	private Player player = new Player(5, 643, 350, "img//lorann_u.png",true);
	private Evil3 evil3 = new Evil3(20, 20, "img//monster_1.png", true, this, player) ;
	private Spell3 spell3 = new Spell3(0, -9000, -9000, "img//fireball_4.png", false, this, player, evil3);
	private Crystal3 crystal3 = new Crystal3(0, 20, 20, "img//crystal_ball.png", true, this, player);
	private Door3 door3 = new Door3(0, 900, 600, "img//gate_closed.png", true, this, player);
	private Purse3 purse3 = new Purse3(0, 1000, 450, "img//purse.png", true, this, player);
	public int directionx;
	public int directiony;
	public boolean Fire=true;
	public boolean B=true;
	

	public Level3() {
		this.setFocusable(true);
		this.addKeyListener(this);
		window.add(this);
		Thread thread = new Thread(evil3);
		Thread Spell = new Thread(spell3);
		Thread Crystal = new Thread(crystal3);
		Thread Door = new Thread(door3);
		Thread Purse = new Thread(purse3);
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
		evil3.drawPlayer(g);
		spell3.drawPlayer(g);
		crystal3.drawPlayer(g);
		door3.drawPlayer(g);
		purse3.drawPlayer(g);
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
			spell3.setxAxis(player.getxAxis()+32);
			spell3.setyAxis(player.getyAxis()+32);
			spell3.setImagePath("img//fireball_4.png");
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

	public Crystal3 getCrystal() {
		return crystal3;
	}

	public void setCrystal(Crystal3 crystal) {
		this.crystal3 = crystal;
	}

}