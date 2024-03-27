package blatt01;

import Prog1Tools.IOTools;

public class Main {
    public static void main(String[] args) {
        String testausgabe = IOTools.readString("Gebe hier einen Testwert ein: ");
        System.out.println("Der Testwert: " + testausgabe);
    }
}