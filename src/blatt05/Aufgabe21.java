package blatt05;

import Prog1Tools.IOTools;

public class Aufgabe21 {

  public static void main(String[] args) {
    int count = IOTools.readInt("Wie viele Zahlen willst du sortieren? ");
    int[] zahl = new int[count];

    for (int i = 0; i < count; i++) {
      zahl[i] = IOTools.readInt((i + 1) + ". Zahl: ");
    }

    for (int k = 1; k < count; k++) {
      int j = 0;
      while (j < count - 1) {   // geht auch mit for-schleife, j wird immer danach erhöht
        int zwischenspeicher = 0;
        if (zahl[j] > zahl[j + 1]) {
          zwischenspeicher = zahl[j];
          zahl[j] = zahl[j + 1];
          zahl[j + 1] = zwischenspeicher;
        }
        j++;
      }
    }

    for (int l = 0; l < count; l++) {
      System.out.print(zahl[l] + " ");
    }
  }
}