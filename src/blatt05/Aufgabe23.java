package blatt05;

import Prog1Tools.IOTools;

public class Aufgabe23 {
    public static void main(String[] args){
        int n = 0;
        while(true) {
            n = IOTools.readInt("Ungerade Zahl zwischen 2 und 10: ");
            if(n >= 2 && n <= 10 && (n%2) != 0){
                break;
            }
        }

        int[][] quadrat = new int[n][n];

        int zeile = n / 2;
        int spalte = (n / 2) + 1;

        for(int i = 1; i <= (n*n); i++){
            quadrat[zeile][spalte] = i;
            spalte++;
            zeile--;

            if(zeile < 0){
                zeile = n-1;
            }
            if (spalte == n) {
                spalte = 0;
            }

            // ungewollte Dauerschleife
            if(quadrat[zeile][spalte] != 0){
                zeile++;
                spalte++;
                if (zeile == n){
                    zeile = 0;
                }
                if (spalte == n){
                    spalte = 0;
                }
            }
        }

        for(int j = 0; j < quadrat.length; j++){
            for(int k = 0; k < quadrat[j].length; k++){
                if(quadrat[j][k] < 10){
                    System.out.print(" ");
                }
                System.out.print(quadrat[j][k] + " ");
            }
            System.out.println();
        }
    }
}