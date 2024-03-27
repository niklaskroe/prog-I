package blatt09.Aufgabe37;

import java.util.Objects;

public class Sound {
    private String raum;
    private int laut;
    private int bass;
    private int hoch;

    public Sound(String raum, int laut, int bass, int hoch){
        this.raum = raum;
        this.laut = laut;
        this.bass = bass;
        this.hoch = hoch;
    }

    public int getLautstaerke(int laut){
        return this.laut;
    }

    public void verstaerke(String regler, int wert){
        if(Objects.equals(regler, "baesse")){
            this.bass += wert;
        } else if (Objects.equals(regler, "hoehen")) {
            this.hoch += wert;
        }
    }

    public String toString(){
        return "Anlage im Raum " + this.raum + ": la: " + this.laut + ", ba: " + this.bass + ", ho: " + this.hoch;
    }
}
