package view;


//import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends JFrame implements IView {

	//private static final long 
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int number;
	JFrame frame = new JFrame ("Lorann");
	static int MyMap[] = new int [625];
	private int i= 0;
	int P=0;
	
    public ViewFacade() {
        super();
        
    }
    
    public void Window() {
    	Panel pan = new Panel(getMyMap());
    	this.setTitle("Lorann");
    	this.setSize(810, 810);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setContentPane(pan);
    	this.setVisible(true);
    	addKeyListener(pan);

    }
    public void closeWindow() {		frame.setVisible(false);	}
    
  	public void Map(int number) {System.out.println("Load Map with this number : "+number);		MyMap[i] = number;	i++;	}
  	
      public int[] getMyMap() {	return MyMap;	}

  	public void setMyMap() {	i=0;	}
  	
  /*	public int ScanMap() {
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Please, enter a number between 1 and 5 include :");
  		int str = sc.nextInt();
  		System.out.println("You choose : " + str);
  		//sc.close();
  		return str;
  	}
	public int[] getMyMap() {
		// TODO Auto-generated method stub
		return MyMap;
	}
	public void Map (int number) {
    	System.out.println("Loading number :" +number);
    	MyMap[i] = number;
    	i++;
    }
	
	public void setMyMap (int[] myMap) {
		MyMap = myMap;
	}

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }



}
