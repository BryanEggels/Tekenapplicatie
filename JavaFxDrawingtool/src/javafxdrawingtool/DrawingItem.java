package javafxdrawingtool;

import java.awt.Color;

/**
 * Created by fam_e on 14-2-2017.
 */


public abstract class DrawingItem implements java.io.Serializable {

    DrawingItem previousState;
    private Color kleur;

    public Color getKleur() {
        return kleur;
    }

    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }

    public abstract void paintUsing(Paintable paintable);

    public DrawingItem(Color kleur) {

        this.kleur = kleur;
    }

    abstract Point GetAnchor();
    abstract Double GetWidth();
    abstract Double Height();


}
