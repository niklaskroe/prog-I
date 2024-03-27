package blatt08.Aufgabe33;

import blatt08.Aufgabe31.Rechnen;
import Prog1Tools.IOTools;

public class BruchRechnen {

    public static void main(String[] args){
        Bruchzahl a = new Bruchzahl();
        einlesen(a);
        System.out.println(wert(a));
        kuerzen(a);
        ausgeben(a);
    }

    public static void einlesen(Bruchzahl a){
        a.zaehler = IOTools.readInt("Zähler: ");
        a.nenner = 0;
        while(a.nenner == 0){
            a.nenner = IOTools.readInt("Nenner: ");
        }
    }

    public static void ausgeben(Bruchzahl a){
        System.out.println(a.zaehler + "/" + a.nenner);
    }

    public static double wert(Bruchzahl a){
        double div = (double) (a.zaehler) / a.nenner;
        return div;
    }

    public static Bruchzahl kehrwert(Bruchzahl a){
        Bruchzahl b = new Bruchzahl();
        b.zaehler = a.nenner;
        b.nenner = a.zaehler;
        return b;
    }

    public static Bruchzahl neg(Bruchzahl a){
        Bruchzahl b = new Bruchzahl();
        b.zaehler = a.zaehler * -1;
        b.nenner = a.nenner;
        return b;
    }

    public static void kuerzen(Bruchzahl a){
        int ggt = Rechnen.ggT(a.nenner, a.zaehler);   // !!!!!
        a.zaehler = a.zaehler / ggt;
        a.nenner = a.nenner / ggt;

        if(a.zaehler < 0 && a.nenner < 0){
            a.zaehler = a.zaehler * -1;
            a.nenner = a.nenner * -1;
        }
    }
}