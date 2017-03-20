package javafxdrawingtool;

import java.awt.*;

/**
 * Created by fam_e on 14-2-2017.
 */
public class PaintedText extends DrawingItem {
    String content;
    String fontName;
    Point anchor;
    double width;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
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

    public PaintedText(java.awt.Color kleur, String content, String fontName, Point anchor, double width, double height) {
        super(kleur);
        this.content = content;
        this.fontName = fontName;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PaintedText{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
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
