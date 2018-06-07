package view;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.concurrent.ThreadLocalRandom;

public class Panel extends JPanel implements IPanel, KeyListener {
	
	

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	//private String imagePath;
	public int [] MyMap;
	public int x = 0;
	public int y = 0;
	public int count = 0;
	public int position = 0;
	public int Posmons = 0;
	public int Posdoor = 0;
	public int player;
	private int deplacement = 0;
	public int Lorann = 1;
	int direc = ThreadLocalRandom.current().nextInt(1, 4 + 1);
	int Score = 0;
	
	public Panel(int[] myMap) {
		// TODO Auto-generated constructor stub
		this.MyMap = myMap;
		System.out.println("test pan");
	}
	

	public void paintComponent(Graphics g) {
		try {
			Image wall = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\horizontal_bone.png"));
			Image lorau = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\lorann_u.png"));
			Image lorab = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\lorann_b.png"));
			Image loral = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\lorann_l.png"));
			Image lorar = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\lorann_r.png"));
			Image gold = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\purse.png"));
			Image door = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\gate_closed.png"));
			Image doorcl = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\gate_open.png"));
			Image ball = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\crystal_ball.png"));
			Image evil = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\monster_1.png"));
			Image wall2 = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\vertical_bone.png"));
			Image corn = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\bone.png"));
			Image nothing = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\black.png"));
			Image zero = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\0.png"));
			Image one = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\1.png"));
			Image two = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\2.png"));
			Image three = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\3.png"));
			Image four = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\4.png"));
			Image img = nothing;
			//Image wall = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\vertical_bone.png"));
		
		for(int i=0;i<MyMap.length;i++) {
			if(MyMap[i] == 0) {img = wall;} 
			if(MyMap[i] == 1) {img = lorab; position = i;}
			if(MyMap[i] == 12) {img = lorau; position = i;}
			if(MyMap[i] == 11) {img = loral; position = i;}
			if(MyMap[i] == 10) {img = lorar; position = i;}
			if(MyMap[i] == 2) {img = gold;}
			if(MyMap[i] == 3) {img = door;Posdoor = i;}
			if(MyMap[i] == 4) {img = ball;}
			if(MyMap[i] == 5) {img = evil; Posmons = i;}
			if(MyMap[i] == 6) {img = nothing;}
			if(MyMap[i] == 7) {img = corn;}
			if(MyMap[i] == 8) {img = wall2;}
			if(MyMap[i] == 9) {img = doorcl;Posdoor = i;}
			
			if(MyMap[i] == 20) {img = zero;}
			if(MyMap[i] == 21) {img = one;}
			if(MyMap[i] == 22) {img = two;}
			if(MyMap[i] == 23) {img = three;}
			if(MyMap[i] == 24) {img = four;}
			
			g.drawImage(img,x,y, 28, 28, this);
			x += 28;
			count++; 
			if (count >= 25) {
				y += 28;
				x = 0;
				count = 0;
			}
			
			
			}
		
		}
			catch (IOException e) {
			      e.printStackTrace();
		}
		direc = ThreadLocalRandom.current().nextInt(1, 4 + 1);
		monster();		
		x = 0;
		y = 0; 
		
	}	
		//g.drawImage(imgmap.getImage(), HEIGHT, WIDTH, null);
	public void monster() {
				
	    if (direc == 1){ //UP
	    	if (MyMap[Posmons-25]==6) { 
	    			MyMap[Posmons-25] = 5;
	    			MyMap[Posmons] = 6;
	    			Posmons = Posmons-25;
	    		}
	    	else direc = ThreadLocalRandom.current().nextInt(1, 4 + 1);
	    }
	    if (direc == 2){ //right
	    	if (MyMap[Posmons+1]==6) { 
	    			MyMap[Posmons+1] = 5;
	    			MyMap[Posmons] = 6;
	    			Posmons=Posmons+1;
	    		}
	    	else direc = ThreadLocalRandom.current().nextInt(1, 4 + 1);
	    }
	    if (direc == 3){ //left
	    	if (MyMap[Posmons-1]==6) { 
	    			MyMap[Posmons-1] = 5;
	    			MyMap[Posmons] = 6;
	    			Posmons=Posmons-1;
	    		}
	    	else direc = ThreadLocalRandom.current().nextInt(1, 4 + 1);
	    }
	    if (direc == 4){ //UP
	    	if (MyMap[Posmons+25]==6) { 
	    			MyMap[Posmons+25] = 5;
	    			MyMap[Posmons] = 6;
	    			Posmons=Posmons+25;
	    		}
	    	else direc = ThreadLocalRandom.current().nextInt(1, 4 + 1);
	    }
	}
	@Override
	public void keyPressed(KeyEvent key) {
		int codeDeLaTouche = key.getKeyCode();
        System.out.println("J'appuie sur la touche : "+ codeDeLaTouche);
        switch (codeDeLaTouche) // Les valeurs sont contenue dans KeyEvent. Elles commencent par VK_ et finissent par le nom de la touche
        {
        
        case KeyEvent.VK_ESCAPE:
    		System.out.println("QUITTER");
    		
    		System.exit(0);
    		
            case KeyEvent.VK_UP:
         
		// TODO Auto-generated method stub
            	Lorann = 12;
		System.out.println("touche"); 
		deplacement = 25;
		System.out.println("Début if vérification passage vide");
		System.out.println("Case du haut, i-25 = " +(position-deplacement)+ " qui vaut : "+MyMap[position-deplacement]);
		//Collision with nothing
		if (MyMap[position-deplacement] == 4) {
			MyMap[position-deplacement] = 6;
			MyMap[position] = 6;
			
			
		}
		if (MyMap[position-deplacement] == 2) {
			MyMap[position-deplacement] = 6;
			MyMap[position] = 6;
			MyMap[12] = MyMap[12]+1;
			
		}
		if (MyMap[position+deplacement] == 9) {
			MyMap[position+deplacement] = 6;
			MyMap[position] = 6;
			
			int exit = JOptionPane.showConfirmDialog(null, "You Won","WINNER",JOptionPane.DEFAULT_OPTION);
			
			if (exit == -1 || exit == 0)
            {
              System.exit(0);
            }
		}
		if (MyMap[position-25] == 3)
		{
			int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
			
			if (exit == -1 || exit == 0)
            {
              System.exit(0);
            } 
	}
		if (MyMap[position-deplacement] == 6) {
		System.out.println("Commencement échange avec case du dessus, i-25 = " +(position-deplacement));
		MyMap[position-deplacement] = Lorann;
		MyMap[position] = 6;
		if (MyMap[position-25] == 5 || MyMap[position+25] == 5 || MyMap[position-1] == 5 || MyMap[position+1] == 5)
		{
		
			int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
			
			
            if (exit == -1 || exit == 0)
            {
              System.exit(0);
            }
            
		}
		
          //  System.exit(0);
		            		/*try {	imageLorann = ImageIO.read(new File("C:\\Users\\Alexis\\git\\JavaProjectMAQ\\view\\src\\main\\java\\view\\lorann_u.png"));	}
		            		catch (IOException e) {		e.printStackTrace();	}*/
		            		
		            		repaint();
		            	}
		else System.out.println("Vous tapez dans un mur !");

		System.out.println("Flèche UP");
		break;
		
		

	 case KeyEvent.VK_DOWN:
		 	Lorann = 1;
			// TODO Auto-generated method stub
			System.out.println("touche"); 
			deplacement = 25;
			System.out.println("Début if vérification passage vide");
			System.out.println("Case du bas, i+25 = " +(position+deplacement)+ " qui vaut : "+MyMap[position+deplacement]);
			//Collision with nothing
			if (MyMap[position+deplacement] == 4) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				MyMap[Posdoor] = 9;
				
			}
			if (MyMap[position+deplacement] == 2) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				MyMap[12] = MyMap[12]+1;
				
			}
			if (MyMap[position+deplacement] == 9) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				
				int exit = JOptionPane.showConfirmDialog(null, "You Won","WINNER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            }
			}
			if (MyMap[position+25] == 3)
			{
				int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            } 
		}
			if (MyMap[position+deplacement] == 6) {
			System.out.println("Commencement échange avec case du dessus, i-25 = " +(position+deplacement));
			MyMap[position+deplacement] = Lorann;
			MyMap[position] = 6;
			if (MyMap[position-25] == 5 || MyMap[position+25] == 5 || MyMap[position-1] == 5 || MyMap[position+1] == 5)
			{
				for(int K=0;K<MyMap.length;K++) {
					MyMap[K] = 6;
					}
				int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            	
	            {
	              System.exit(0);
	            }
			}
			
			            		/*try {	imageLorann = ImageIO.read(new File("C:\\Users\\Alexis\\git\\JavaProjectMAQ\\view\\src\\main\\java\\view\\lorann_u.png"));	}
			            		catch (IOException e) {		e.printStackTrace();	}*/
			            		
			            		repaint();
			            	}
			else System.out.println("Vous tapez dans un mur !");

			System.out.println("Flèche DOWN");
			break;
       
	 case KeyEvent.VK_LEFT:
		 	Lorann = 11;
			// TODO Auto-generated method stub
			System.out.println("touche"); 
			deplacement = 1;
			System.out.println("Début if vérification passage vide");
			System.out.println("Case du bas, i+25 = " +(position-deplacement)+ " qui vaut : "+MyMap[position-deplacement]);
			//Collision with nothing
			if (MyMap[position-deplacement] == 4) {
				MyMap[position-deplacement] = 6;
				MyMap[position] = 6;
				MyMap[Posdoor] = 9;
				
			}
			if (MyMap[position-deplacement] == 2) {
				MyMap[position-deplacement] = 6;
				MyMap[position] = 6;
				
				MyMap[12] = MyMap[12]+1 ;
				
			}
			if (MyMap[position+deplacement] == 9) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				
				int exit = JOptionPane.showConfirmDialog(null, "You Won","WINNER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            }
			}
			if (MyMap[position-1] == 3)
			{
				int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            } 
		}
			if (MyMap[position-deplacement] == 6) {
			System.out.println("Commencement échange avec case du dessus, i-25 = " +(position-deplacement));
			MyMap[position-deplacement] = Lorann;
			MyMap[position] = 6;
			if (MyMap[position-25] == 5 || MyMap[position+25] == 5 || MyMap[position-1] == 5 || MyMap[position+1] == 5)
			{
				for(int K=0;K<MyMap.length;K++) {
					MyMap[K] = 6;
					}
				int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
				
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            }
	           
			}
			
			            		/*try {	imageLorann = ImageIO.read(new File("C:\\Users\\Alexis\\git\\JavaProjectMAQ\\view\\src\\main\\java\\view\\lorann_u.png"));	}
			            		catch (IOException e) {		e.printStackTrace();	}*/
			            		
			            		repaint();
			            	}
			else System.out.println("Vous tapez dans un mur !");

			System.out.println("Flèche lft");
			break;
			
	 case KeyEvent.VK_RIGHT:
		 	Lorann = 10;
			// TODO Auto-generated method stub
			System.out.println("touche"); 
			deplacement = 1;
			System.out.println("Début if vérification passage vide");
			System.out.println("Case du bas, i+25 = " +(position+deplacement)+ " qui vaut : "+MyMap[position+deplacement]);
			//Collision with nothing
			if (MyMap[position+deplacement] == 4) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				MyMap[Posdoor] = 9;
				
			}
			if (MyMap[position+deplacement] == 2) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				MyMap[12] = MyMap[12]+1;
				
			}
			if (MyMap[position+deplacement] == 9) {
				MyMap[position+deplacement] = 6;
				MyMap[position] = 6;
				
				int exit = JOptionPane.showConfirmDialog(null, "You Won","WINNER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            }
			}
			if (MyMap[position+1] == 3)
			{
				int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
	              System.exit(0);
	            } 
		}
			if (MyMap[position+deplacement] == 6) {
			System.out.println("Commencement échange avec case du dessus, i-25 = " +(position+deplacement));
			MyMap[position+deplacement] = Lorann;
			MyMap[position] = 6;
			if (MyMap[position-25] == 5 || MyMap[position+25] == 5 || MyMap[position-1] == 5 || MyMap[position+1] == 5)
			{
				for(int K=0;K<MyMap.length;K++) {
					MyMap[K] = 6;
				}
				int exit = JOptionPane.showConfirmDialog(null, "You Died","LOSER",JOptionPane.DEFAULT_OPTION);
				
				if (exit == -1 || exit == 0)
	            {
					System.exit(0);
	            }
	           
			}
			
			            		/*try {	imageLorann = ImageIO.read(new File("C:\\Users\\Alexis\\git\\JavaProjectMAQ\\view\\src\\main\\java\\view\\lorann_u.png"));	}
			            		catch (IOException e) {		e.printStackTrace();	}*/
			            		
			            		repaint();
			            	}
			else System.out.println("Vous tapez dans un mur !");

			System.out.println("Flèche lft");
			break;
			
			   
			
        }
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

//	public void drawmap() {
//	
//	if(MyMap[i]==0){
//		setImagePath("img//vertical_bone.png");
//	 }
//	
//	 else if(ViewFacade.MyMap[i]==1){
//		 setImagePath("img//LORANN.png");
//	 }
//	 else if(ViewFacade.number==2){
//		 setImagePath("img//purse.png");
//	 }
//	 else if(ViewFacade.number==3){
//		 setImagePath("img//gate_closed.png");
//	 }
//	 else if(ViewFacade.number==4){
//		 setImagePath("img//crystal_ball.png");
//	}
//	 else if(ViewFacade.number==5) {
//		 setImagePath("img//EVIL.png");
//	 }
//	 else if(ViewFacade.number==6) {
//	 }
//	}

