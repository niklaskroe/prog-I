package blatt08.Aufgabe31;

import Prog1Tools.IOTools;

public class Rechnen {
    public static void main(String[] args){
        int a = IOTools.readInt("Wert 1: ");
        int b = IOTools.readInt("Wert 2: ");
        System.out.println(ggT(a, b));
    }

    public static int ggT(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }

        if(a < 0){
            a = a * -1;
        }
        int x = a;

        if(b < 0){
           b = b * -1;
        }
        int y = b;

        while(x != y){
            if(x > y){
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }
}
