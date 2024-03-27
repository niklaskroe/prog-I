package blatt05;

import Prog1Tools.IOTools;

public class Aufgabe22 {
    public static void main(String[] args){
        int height = IOTools.readInt("Anzahl der Zeilen: ");

        int maxWidth = height * 2 - 1;

        for (int row = 1; row <= height; row++){
            int width = row * 2 - 1;
            int spacer = (maxWidth - width) / 2;

            if(spacer != 0){
                for(int j = 1; j <= spacer; j++){
                    System.out.print(" ");
                }
            }

            for(int i = 1; i <= width; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        int spacer = (maxWidth - 1) / 2;
        for(int j = 1; j <= spacer; j++){
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
