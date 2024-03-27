package blatt09.Aufgabe35;

import Prog1Tools.IOTools;

public class testCD {
    public static void main(String[] args){
        System.out.println("Geben Sie die Daten einer CD ein:");
        String titel = IOTools.readLine("Titel: ");
        double spieldauer = IOTools.readDouble("Spieldauer: ");
        boolean ausgeliehen = IOTools.readBoolean("ausgeliehen: ");
        CD cd1 = new CD(titel, spieldauer, ausgeliehen);
        System.out.println(cd1);
    }
}
