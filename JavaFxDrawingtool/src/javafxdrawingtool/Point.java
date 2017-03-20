package javafxdrawingtool;

/**
 * Created by fam_e on 14-2-2017.
 */
public class Point implements java.io.Serializable {

    double y;
    double x;

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Point(double y, double x) {
        this.y = y;
        this.x = x;
    }
}
