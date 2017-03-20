package javafxdrawingtool;



import javafx.collections.ObservableList;

import java.awt.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by fam_e on 14-2-2017.
 */
public class Drawing extends DrawingItem implements java.io.Serializable{

    private ObservableList<DrawingItem> observableList;

    public Drawing(Color kleur) {
        super(kleur);
        items = new ArrayList <>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public ArrayList<DrawingItem> items;




    public ArrayList<DrawingItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<DrawingItem> items) {
        this.items = items;
    }
    public void paint(JavaFXPaintable paintable){
        
        for (DrawingItem i : getItems()) {
            i.paintUsing(paintable);
        }
    }

    @Override
    public void paintUsing(Paintable paintable) {

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
}
