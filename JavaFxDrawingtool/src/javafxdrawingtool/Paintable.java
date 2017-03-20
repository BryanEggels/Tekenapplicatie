package javafxdrawingtool;

/**
 * Created by fam_e on 21-2-2017.
 */
public interface Paintable {

    void paint(Oval oval);
    void paint(Polygon polygon);
    void paint(PaintedText text);
    void paint(Image image);
}
