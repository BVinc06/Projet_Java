package gameframe;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6756465959069342104L;

	public GamePanel(IGraphicsBuilder graphicsBuilder){}

    @Override
    public void update(Observable observable, Object object) {

    }

    @Override
    public void paintComponents(Graphics graphics) {
        super.paintComponents(graphics);
    }
}
