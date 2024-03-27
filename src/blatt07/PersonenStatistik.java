package blatt07;

import Prog1Tools.IOTools;

public class PersonenStatistik {
    public static void main(String[] args) {
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

        double avgA, varA;

        int maxA = person[anzahl-1].alter;
        int minA = person[0].alter;

        double zsumme = 0;

        for(int h = 0; h < person.length; h++){     // Summe aller Alterszahlen
            zsumme = zsumme + person[h].alter;
        }

        avgA = zsumme / person.length;

        varA = 0;
        for(Person x : person){
            varA = varA + Math.pow((x.alter - avgA), 2) / person.length;
        }

        System.out.println();

        System.out.println("Mittelwert der Altersangaben: " + avgA);
        System.out.println("Varianz der Altersangaben: " + varA);
        System.out.println("Minimum der Altersangaben: " + minA);
        System.out.println("Maximum der Altersangaben: " + maxA);
    }
}