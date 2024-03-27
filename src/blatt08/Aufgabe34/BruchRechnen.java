package blatt08.Aufgabe34;

import Aufgabe31.Rechnen; // Import um Zugriff auf Methode ggT (größter gemeinsamer Teiler) zu ermöglichen (line 66)
import Prog1Tools.IOTools;

public class BruchRechnen {

    public static void main(String[] args){
        // Objekte zum Einlesen erstellen
        Bruchzahl x = new Bruchzahl();
        Bruchzahl y = new Bruchzahl();

        // Einlesen
        System.out.println("Erste Bruchzahl: ");
        einlesen(x);
        System.out.println("Zweite Bruchzahl: ");
        einlesen(y);

        // Rechenmethoden mit Ausgabe-Methode aufrufen & reelle Werte ausgeben
        System.out.println("Multiplikation: ");
        ausgeben(mul(x, y));
        System.out.print("(" + wert(mul(x, y)) + ")");
        System.out.println("Division: ");
        ausgeben(div(x, y));
        System.out.print("(" + wert(div(x, y)) + ")");
        System.out.println("Addition: ");
        ausgeben(add(x, y));
        System.out.print("(" + wert(add(x, y)) + ")");
        System.out.println("Subtraktion: ");
        ausgeben(sub(x, y));
        System.out.print("(" + wert(sub(x, y)) + ")");
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
        int ggt = Rechnen.ggT(a.nenner, a.zaehler); // ! Aufruf der Methode GGt von der Klasse Rechnen vom Package Aufgabe 31
        a.zaehler = a.zaehler / ggt;
        a.nenner = a.nenner / ggt;

        if(a.zaehler < 0 && a.nenner < 0){
            a.zaehler = a.zaehler * -1;
            a.nenner = a.nenner * -1;
        }
    }

    public static Bruchzahl mul(Bruchzahl a, Bruchzahl b){
        Bruchzahl c = new Bruchzahl();
        c.zaehler = a.zaehler * b.zaehler;
        c.nenner = a.nenner * b.nenner;
        kuerzen(c);
        return c;
    }

    public static Bruchzahl div(Bruchzahl a, Bruchzahl b){
        Bruchzahl c = new Bruchzahl();
        c = mul(a, kehrwert(b));
        return c;
    }

    public static Bruchzahl add(Bruchzahl a, Bruchzahl b){
        Bruchzahl c = new Bruchzahl();
        c.zaehler = a.zaehler * b.nenner + b.zaehler * a.nenner;
        c.nenner = a.nenner * b.nenner;
        kuerzen(c);
        return c;
    }

    public static Bruchzahl sub(Bruchzahl a, Bruchzahl b){
        return add(a, neg(b));
    }
}