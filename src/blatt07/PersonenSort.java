package blatt07;

import Prog1Tools.IOTools;

public class PersonenSort {
    public static void main(String[] args){
        int anzahl = IOTools.readInt("Wie viele Personen willst du sortieren? ");
        Person[] person = new Person[anzahl];

        for (int i = 0; i < anzahl; i++){
            System.out.println((i + 1) + ". Person: ");

            person[i] = new Person();
            person[i].personalnummer = Person.pnummer++;
            person[i].nachname = IOTools.readString("Nachname: ");
            person[i].name = IOTools.readString("Vorname: ");
            person[i].alter = IOTools.readInt("Alter: ");

        }

        for (int k = 1; k < anzahl; k++){
            int j = 0;
            while (j < anzahl-1) {   // geht auch mit for-schleife, j wird immer danach erhöht
                Person zwischenspeicher;
                if (person[j].alter > person[j + 1].alter){
                    zwischenspeicher = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = zwischenspeicher;
                }
                j++;
            }
        }

        System.out.println();

        for (int l = 0; l < anzahl; l++){
            System.out.println("Person " + (l + 1) + ": " + person[l].name + " " + person[l].nachname + ", " + person[l].alter + " Jahre, persNr. " + person[l].personalnummer);
        }
    }
}