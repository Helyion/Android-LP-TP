package helyion.github.classroom_better;

import android.media.Image;

public class Lieu {
    private String nom;
    private int imgID;
    public Lieu(String nom){
        this.nom = nom;
        this.imgID = R.drawable.paris;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
