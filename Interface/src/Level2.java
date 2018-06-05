import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Level2 extends JPanel implements KeyListener {
	
	private static Thread Spell2;
	public int widthofscene = 1287;
	public int heightofscene = 700;
	//private static final int xAxis_of_evil = 10;
	//private static final int yAxis_of_evil = 10;
	private JFrame window = new JFrame("Lorann - Level #2");
	private ImageIcon background = new ImageIcon("img//background.png");
	private Player player = new Player(5, 643, 350, "img//lorann_u.png",true);
	private Evil2 evil2 = new Evil2(20, 20, "img//monster_1.png", true, this, player) ;
	private Spell2 spell2 = new Spell2(0, -9000, -9000, "img//fireball_4.png", false, this, player, evil2);
	private Crystal2 crystal2 = new Crystal2(0, 20, 20, "img//crystal_ball.png", true, this, player);
	private Door2 door2 = new Door2(0, 900, 600, "img//gate_closed.png", true, this, player);
	private Purse2 purse2 = new Purse2(0, 1000, 450, "img//purse.png", true, this, player);
	public int directionx;
	public int directiony;
	public boolean Fire=true;
	public boolean B=true;
	

	public Level2() {
		this.setFocusable(true);
		this.addKeyListener(this);
		window.add(this);
		Thread thread = new Thread(evil2);
		Thread Spell = new Thread(spell2);
		Thread Crystal = new Thread(crystal2);
		Thread Door = new Thread(door2);
		Thread Purse = new Thread(purse2);
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
		evil2.drawPlayer(g);
		spell2.drawPlayer(g);
		crystal2.drawPlayer(g);
		door2.drawPlayer(g);
		purse2.drawPlayer(g);
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
			spell2.setxAxis(player.getxAxis()+32);
			spell2.setyAxis(player.getyAxis()+32);
			spell2.setImagePath("img//fireball_4.png");
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

	public Crystal2 getCrystal() {
		return crystal2;
	}

	public void setCrystal(Crystal2 crystal) {
		this.crystal2 = crystal;
	}

}