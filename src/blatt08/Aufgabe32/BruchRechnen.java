package blatt08.Aufgabe32;

import Prog1Tools.IOTools;

public class BruchRechnen {

    public static void main(String[] args){
        Bruchzahl a = new Bruchzahl();
        einlesen(a);
        System.out.println(wert(a));
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
}