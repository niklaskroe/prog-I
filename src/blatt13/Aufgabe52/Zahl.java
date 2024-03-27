package blatt13.Aufgabe52;

public abstract class Zahl {
     /**
     * f?hrt eine Negation durch und liefert den negierten Wert der Zahl als 
     * neues Objekt zur?ck
     */
    public abstract Zahl neg();

    /**
     * f?hrt eine Addition durch und liefert die Summe 
     * (ausf?hrendes Objekt + Parameter-Objekt) als neues Objekt zur?ck
     */
    public abstract Zahl add(Zahl zahl);

    /**
     * f?hrt eine Subtraktion durch (unter Verwendung von add und neg)
     * und liefert die Differenz (ausf?hrendes Objekt - Parameter-Objekt) 
     * als neues Objekt zur?ck
     */
    public Zahl sub(Zahl zahl) {  // Methode ist ausprogrammiert, muss daher in
      return add(zahl.neg());     // Tochterklassen nicht implementiert werden!
    }
}
