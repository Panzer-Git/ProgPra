package Pra_6.aufgabe_2;

import java.util.Scanner;

public class Spieler {
    String Farbe;
    Scanner scanner = new Scanner(System.in);

    Spieler(String Farbe){
        this.Farbe = Farbe;
    }

    public void zug(Spielfeld feld) {
        String answer = this.scanner.nextLine();
        int x = Integer.parseInt(answer.split(",")[0]);
        int y = Integer.parseInt(answer.split( ",")[1]);
        if (feld.getFeld()[x-1][y-1].getFarbe().equals("leer")) {
            feld.legeAb(x-1, y-1, new Plaettchen(this.getFarbe()));
        } else {
            System.out.println("Die Stelle is bereits  besetzt!");
            zug(feld);
        }
    }

    public String getFarbe() {
        return this.Farbe;
    }

    public char getFarbChar() {
        return this.Farbe.charAt(0);
    }
}
