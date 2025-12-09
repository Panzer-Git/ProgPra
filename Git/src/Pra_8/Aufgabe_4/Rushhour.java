package Pra_8.Aufgabe_4;

import java.util.Scanner;

public class Rushhour {
    Spielfeld feld;
    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Feldkonstruktion:");
        this.feld = new Spielfeld("122_3_145_36145**67778_6__98aabb9cc_"
                //input.nextLine()
                );
        while (!feld.checkGewinn()) {
            feld.printFeld();
            feld.zug();
        }
        System.out.println("Spiel gewonnen!");
    }
}
