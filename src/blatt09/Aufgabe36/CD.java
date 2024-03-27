package blatt09.Aufgabe36;

public class CD {
    public String titel;
    public double spieldauer;
    public boolean ausgeliehen;

    // Konstruktor
    public CD(String ti, double sp, boolean au){
        this.titel = ti;
        this.spieldauer = sp;
        this.ausgeliehen = au;
    }

    public String toString() {
        return this.titel + " (" + this.spieldauer + " Minuten)";
    }
}
