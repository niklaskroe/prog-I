package blatt11.Aufgabe45_46;

public class DameFigur extends Spielfigur {
    private final String name =  "Dame";

    public DameFigur(char x, int y, String f) {
        super(x, y, f);
    }

    public void ziehe(char richtung, int anzahl){
        switch (richtung){
            case '-':
                ziehe(anzahl, 0);
                break;
            case '|':
                ziehe(0, anzahl);
                break;
            case '/':
                ziehe(anzahl, anzahl);
                break;
            case '\\':
                ziehe(anzahl, -anzahl);
                break;
        }
    }

    public boolean trifft(DameFigur d){
        if (d.getXpos() == this.getXpos() && d.getYpos() == this.getYpos()){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return getFarbe() + "e Dame auf dem Feld " + getXpos() + getYpos();
    }
}
