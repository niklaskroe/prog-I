package blatt09.Aufgabe39_40_41;

import Prog1Tools.IOTools;

public class BruchRechner {
    public static void main(String[] args) {
        Bruch b1 = new Bruch();
        Bruch b2 = new Bruch();

        char quit = ' ';

        while(quit != 'x'){
            System.out.println("----------------------------------------");
            System.out.println("Bruch 1: " + b1);
            System.out.println("Bruch 2: " + b2);
            System.out.println("----------------------------------------");
            System.out.println("Aktionen:");
            System.out.println("x: beenden");
            System.out.println("1: Bruch 1 eingeben");
            System.out.println("2: Bruch 2 eingeben");
            System.out.println("b: Brueche kuerzen");
            System.out.println("+, - , * , /: Grundrechenarten");
            System.out.println("n: Bruch 1 negativ");
            System.out.println("k: Kehrwert von Bruch 1");
            System.out.println("d: Double-Wert von Bruch 1");
            System.out.println("----------------------------------------");

            char input = IOTools.readChar("Eingabe: ");

            switch(input){
                case 'x':
                    quit = 'x';
                    break;
                case '1':
                    b1.einlesen();
                    break;
                case '2':
                    b2.einlesen();
                    break;
                case 'b':
                    System.out.println(b1.kuerzen());
                    System.out.println(b2.kuerzen());
                    break;
                case '+':
                    System.out.println(b1.add(b2));
                    break;
                case '-':
                    System.out.println(b1.sub(b2));
                    break;
                case '*':
                    System.out.println(b1.mul(b2));
                    break;
                case '/':
                    System.out.println(b1.div(b2));
                    break;
                case 'n':
                    System.out.println(b1.neg());
                    break;
                case 'k':
                    System.out.println(b1.kehrwert());
                    break;
                case 'd':
                    System.out.println(b1.wert());
                    break;
                default:
                    continue;
            }
        }
    }
}
