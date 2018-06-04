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
	static int MyMap[] = new int [650];
	private int i= 0;
	
    public ViewFacade() {
        super();
        
    }
    public void Window() {
    
    	frame.setTitle("Lorann");
    	frame.setSize(810, 810);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setContentPane(new Panel(getMyMap()));
    	System.out.println("ché");
    	frame.setVisible(true);
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
