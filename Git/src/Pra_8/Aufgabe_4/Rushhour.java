package Pra_8.Aufgabe_4;

import java.util.Scanner;

public class Rushhour {
    Spielfeld feld;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Rushhour game = new Rushhour();
        game.start();
    }

    public void start() {
        System.out.println("Feldkonstruktion:");
        this.feld = new Spielfeld(input.nextLine());
        while (!feld.checkGewinn()) {
            feld.printFeld();
            feld.zug();
        }
        System.out.println("Spiel gewonnen!");
    }
}

// 122_3_145_36145**67778_6__98aabb9cc_
/*
122_3_
145_36
145**6
7778_6
__98aa
bb9cc_
 */
/*
112_33
__2_44
**___5
6__775
688__d
699__d
 */

// 112_33__2_44**___56__775688__d699__d