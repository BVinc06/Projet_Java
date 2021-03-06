package gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
    public void applyModelToGraphics(Graphics graphics, ImageObserver observer);

    public int getGlobalWidth();

    public int getGlobalHeight();
}
