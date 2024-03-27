package blatt09.Aufgabe38;

import Prog1Tools.IOTools;

public class Punkt {
    private double x, y;

    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void read(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
