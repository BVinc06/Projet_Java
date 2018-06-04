package view;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel implements IPanel {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private String imagePath;
	private int [] MyMap;
	private int x = 0;
	private int y = 0;
	private int count = 0;
	
	public Panel(int[] myMap) {
		// TODO Auto-generated constructor stub
		this.MyMap = myMap;
		System.out.println("test pan");
	}
	
	public void paintComponent(Graphics g) {
		try {
			Image wall = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\vertical_bone.png"));
			Image lora = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\lorann_b.png"));
			Image gold = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\purse.png"));
			Image door = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\gate_open.png"));
			Image ball = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\crystal_ball.png"));
			Image evil = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\monster_1.png"));
			Image nothing = ImageIO.read(new File("D:\\1 Cesi\\AProjet Java\\sprite\\black.png\\"));
			Image img = nothing;
			//Image wall = ImageIO.read(new File ("D:\\1 Cesi\\AProjet Java\\sprite\\vertical_bone.png"));
		
		for(int i=0;i<MyMap.length;i++) {
			if(MyMap[i] == 0) {img = wall;}
			if(MyMap[i] == 1) {img = lora;}
			if(MyMap[i] == 2) {img = gold;}
			if(MyMap[i] == 3) {img = door;}
			if(MyMap[i] == 4) {img = ball;}
			if(MyMap[i] == 5) {img = evil;}
			if(MyMap[i] == 6) {img = nothing;}
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
		}	
		//g.drawImage(imgmap.getImage(), HEIGHT, WIDTH, null);
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

