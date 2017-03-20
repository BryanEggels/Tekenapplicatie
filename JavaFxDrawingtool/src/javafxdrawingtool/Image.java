package javafxdrawingtool;

import java.awt.*;
import java.io.File;

/**
 * Created by fam_e on 14-2-2017.
 */
public class Image extends DrawingItem {
    File file;
    Point anchor;
    double width;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

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

    double height;

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

    public Image(java.awt.Color kleur, File file, Point anchor, double width, double height) {
        super(kleur);
        this.file = file;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Image{" +
                "file=" + file +
                ", anchor=" + anchor +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void paintUsing(Paintable paintable) {
        paintable.paint(this);
    }
    
}
