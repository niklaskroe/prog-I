package blatt09.Aufgabe36;

import Prog1Tools.IOTools;

public class Party {
    public static void main(String[] args){
        int anzahl = IOTools.readInt("Wieviele CDs willst Du eingeben? ");
        CD[] cdf = new CD[anzahl];
        einlesen(cdf);
        sortieren(cdf);
        vorhandeneAusgeben(cdf);
    }

    public static void einlesen(CD[] cdf){
        for(int i = 0; i < cdf.length; i++){
            String titel = IOTools.readLine("Titel: "); // readLine liest bis zum Zeilenende
            double spieldauer = IOTools.readDouble("Spieldauer: ");
            boolean ausgeliehen = IOTools.readBoolean("ausgeliehen: ");
            cdf[i] = new CD(titel, spieldauer, ausgeliehen);
        }
    }

    public static void sortieren(CD[] cdf){
        for(int n = 0; n < cdf.length; n++){
            for(int i = 0; i < (n - 1); i++){
                CD temp;
                if (cdf[i].spieldauer < cdf[i + 1].spieldauer) {
                    temp = cdf[i];
                    cdf[i]= cdf[i + 1];
                    cdf[i + 1] = temp;
                }
            }
        }
    }

    public static void vorhandeneAusgeben(CD[] cdf){
        System.out.println("Nicht ausgeliehene CDs, nach Spieldauer sortiert:");
        for(int i = 0; i < cdf.length; i++){
            if(!cdf[i].ausgeliehen){
                System.out.println(cdf[i]);
            }
        }
    }
}