package javafxdrawingtool;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by fam_e on 21-2-2017.
 */
public class JavaFXPaintable implements Paintable {

    
    private GraphicsContext gc;
    
    @Override
    public void paint(Oval oval) {
        gc.strokeOval(oval.anchor.x, oval.anchor.y, oval.width, oval.height);
    }

    @Override
    public void paint(Polygon polygon) {
        
    }

    @Override
    public void paint(PaintedText text) {
        gc.strokeText(text.toString(), text.anchor.x, text.anchor.y);
    }

    @Override
    public void paint(Image image) {
        
    }

    public JavaFXPaintable(GraphicsContext gc) {
        this.gc = gc;
    }
    
}
