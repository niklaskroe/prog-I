package blatt09.Aufgabe38;

import Prog1Tools.IOTools;

public class Strecke {
    private Punkt p, q;

    public Strecke(Punkt p, Punkt q){
        this.p = p;
        this.q = q;
    }

    public void read(){
        p.read(IOTools.readDouble("x = "), IOTools.readDouble("y = "));
        q.read(IOTools.readDouble("x = "), IOTools.readDouble("y = "));
    }

    public double getLaenge(){
        return Math.sqrt(Math.pow(p.getX() -  q.getX(), 2) + Math.pow(p.getY() -  q.getY(), 2));
    }

    public String toString(){
        return p.toString() + "_" + q.toString();
    }
}
