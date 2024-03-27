package blatt11.Aufgabe45_46;

import Prog1Tools.IOTools;

public class DSpiel {
    public static void main(String[] args) {
        System.out.println("Positionieren Sie die Beute");
        char xPos = IOTools.readChar("Spalte (A bis H) Ihrer Figur? ");
        int yPos = IOTools.readInt("Zeile (1 bis 8) Ihrer Figur? ");
        String farbe = IOTools.readString("Farbe Ihrer Figur? ");
        DameFigur b = new DameFigur(xPos, yPos, farbe);

        Bildschirm.loeschen();

        System.out.println("Die Beute steht. Positionieren Sie den Jaeger");
        xPos = IOTools.readChar("Spalte (A bis H) Ihrer Figur? ");
        yPos = IOTools.readInt("Zeile (1 bis 8) Ihrer Figur? ");
        farbe = IOTools.readString("Farbe Ihrer Figur? ");
        DameFigur j = new DameFigur(xPos, yPos, farbe);

        boolean value = j.trifft(b);

        if (!j.trifft(b)){
            System.out.println("Die Beute-Figur steht woanders!");
            System.out.println("Sie haben nun 10 Dame-Zuege, um die Beute-Figur zu treffen.");

            for (int i = 0; i < 10; i++){
                System.out.println("Bewegen Sie Ihre " + j);
                char richtung = IOTools.readChar("Wollen Sie waagrecht (-), senkrecht (|) oder diagonal (/, \\) ziehen? ");
                int anzahl = IOTools.readInt("Wie viele Felder ziehen? (> 0 nach rechts oben, < 0 nach links unten) ");
                j.ziehe(richtung, anzahl);

                if(j.trifft(b)){
                    System.out.println("Treffer beim " + i+1 + ". Versuch!");
                    break;
                } else {
                    System.out.println("Leider kein Treffer!");

                    if (i == 9){
                        System.out.println("Auch zuletzt kein Treffer!");
                    }
                }
            }
        }
    }
}
