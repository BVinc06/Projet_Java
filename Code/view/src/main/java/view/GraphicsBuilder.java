package view;

public class GraphicsBuilder implements IGraphicsBuilder {
    private BufferedImage BufferedImage;
    private IModel Model;

    public GraphicsBuilder(IModel Model){
        this.Model = Model;
    }


    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){}

    public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {

    }

    public int getGlobalWidth() {
        return 0;
    }

    public int getGlobalHeight() {
        return 0;
    }
}
