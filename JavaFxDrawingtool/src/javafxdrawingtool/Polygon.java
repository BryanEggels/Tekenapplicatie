package javafxdrawingtool;

import java.awt.*;
import java.util.List;

/**
 * Created by fam_e on 14-2-2017.
 */
public class Polygon extends DrawingItem {
    List <Point> verticles;
    double weight;

    public List<Point> getVertices() {
        return verticles;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    Point GetAnchor() {
        return null;
    }

    @Override
    Double GetWidth() {
        return null;
    }

    @Override
    Double Height() {
        return null;
    }

    public Polygon(java.awt.Color kleur, List<Point> vertices, double weight) {
        super(kleur);
        this.verticles = vertices;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + verticles +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void paintUsing(Paintable paintable) {
        paintable.paint(this);
    }
    
}
