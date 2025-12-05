package Pra_8.Aufgabe_4;

import java.util.Scanner;

public class Rushhour {
    Spielfeld feld;
    Scanner input = new Scanner(System.in);
    public void start() {
        this.feld = new Spielfeld(input.nextLine());
        while (feld.checkGewinn()==false) {
            feld.zug();
        }
    }
}
