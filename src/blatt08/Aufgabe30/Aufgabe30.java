package blatt08.Aufgabe30;

import Prog1Tools.IOTools;

public class Aufgabe30 {
    public static void main(String[] args){
        long x = IOTools.readLong("Gebe ein Zahl zum Berechnen der Quersumme ein: ");

         while(x > 9){
            x = quersumme(x);
        }
        System.out.println("Die Quersumme beträgt: " + x);
    }

    public static long quersumme(long x){
        long qs = 0;
        while(x > 0){
            long z = x % 10;
            qs = qs + z;
            x = x / 10;
        }
        return qs;
    }
}
