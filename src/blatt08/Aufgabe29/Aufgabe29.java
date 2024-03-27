package blatt08.Aufgabe29;

import Prog1Tools.IOTools;

public class Aufgabe29 {
    public static void main(String[] args) {
        int n = IOTools.readInt("Anzahl der Werte: "); // n einlesen
        while (n > 0) {
            double[] x = new double[n]; // Feld erzeugen
            readWerte(x); // Werte einlesen
            System.out.println("Die Varianz ist " + varianz(x)); // Varianz berechnen
            n = IOTools.readInt("Anzahl der Werte: "); // n neu einlesen
        }
    }

    public static void readWerte(double[] x){
        for(int i = 0; i < x.length; i++){
            x[i] = IOTools.readDouble(i + 1 + ". double wert: ");
        }
    }

    public static double mittelwert(double[] x){
        double avg = 0;
        for(int i = 0; i < x.length; i++){
            avg = avg + x[i];
        }
        avg = avg / x.length;
        return avg;
    }
    
    public static double varianz(double[] x){
        double var = 0;
        double m = mittelwert(x);

        for(int i = 0; i < x.length; i++){
            var = var + Math.pow((x[i] - m), 2) / x.length;
        }
        return var;
    }
}