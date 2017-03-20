package javafxdrawingtool;

import java.awt.*;

/**
 * Created by fam_e on 14-2-2017.
 */
public class Oval extends DrawingItem {

    Point anchor;
    double width;
    double height;
    double weight;



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }
   

    @Override
    Double Height() {
        return null;
    }

    public Oval(java.awt.Color kleur, Point anchor, double width, double height, double weight) {
        super(kleur);
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "anchor=" + anchor +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    Point GetAnchor() {
        return anchor;
    }

    @Override
    Double GetWidth() {
        return width;
    }

    @Override
    public void paintUsing(Paintable paintable) {
        paintable.paint(this);
    }
}
