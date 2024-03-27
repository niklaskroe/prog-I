package blatt15.Aufgabe56;

public class Gleichung {
    public double a, b, c;

    public Gleichung(String a, String b, String c){
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
    }

    public Loesung berechneLoesung(){
        if (a == 0){
            throw new NichtquadratischException("a = 0 nicht zulaessig");
        }
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0){
            throw new UnloesbarException("b*b-4*a*c = " + d + " < 0");
        }
        double w = Math.sqrt(d);

        
    }
}
