package blatt09.Aufgabe39_40_41;

import Prog1Tools.IOTools;

public class Bruch {
    public int zaehler, nenner;

    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Bruch(){

    }

    public static int ggT(int nenner, int zaehler){
        if(zaehler == 0){
            return nenner;
        }
        if(nenner == 0){
            return zaehler;
        }

        if(zaehler < 0){
            zaehler = zaehler * -1;
        }
        int x = zaehler;

        if(nenner < 0){
            nenner = nenner * -1;
        }
        int y = nenner;

        while(x != y){
            if(x > y){
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }

    public Bruch kuerzen(){
        int ggt = ggT(this.nenner, this.zaehler);
        Bruch b = new Bruch();
        b.zaehler = this.zaehler / ggt;
        b.nenner = this.nenner / ggt;

        if(this.zaehler < 0 && this.nenner < 0){
            b.zaehler = this.zaehler * -1;
            b.nenner = this.nenner * -1;
        }
        return b;
    }

    public Bruch kehrwert(){
        Bruch b = new Bruch();
        b.zaehler = this.nenner;
        b.nenner = this.zaehler;
        return b;
    }

    public Bruch neg(){
        Bruch b = new Bruch();
        b.zaehler = this.zaehler * -1;
        b.nenner = this.nenner;
        return b;
    }

    public double wert(){
        double div = (double) (this.zaehler) / this.nenner;
        return div;
    }

    public Bruch mul(Bruch a){
        return new Bruch(this.zaehler*a.zaehler, this.nenner*a.nenner).kuerzen();
    }

    public Bruch div(Bruch a){
        return new Bruch(this.zaehler*a.nenner, this.nenner*a.zaehler).kuerzen();
    }

    public Bruch add(Bruch a){
        return new Bruch(this.zaehler * a.nenner + a.zaehler * this.nenner, this.nenner * a.nenner).kuerzen();
    }

    public Bruch sub(Bruch a){
        return this.add(a.neg()).kuerzen();
    }

    public void einlesen(){
        this.zaehler = IOTools.readInt("Zähler: ");
        this.nenner = 0;
        while(this.nenner == 0){
            this.nenner = IOTools.readInt("Nenner: ");
        }
    }

    public String toString(){
        return this.zaehler + "/" + this.nenner;
    }
}
