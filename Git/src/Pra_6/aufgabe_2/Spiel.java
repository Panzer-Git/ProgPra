package Pra_6.aufgabe_2;

public class Spiel {
    Spielfeld feld;
    Spieler spielerGruen;
    Spieler spielerBlau;

    public void starte() {
        this.feld = new Spielfeld();
        this.spielerBlau = new Spieler("blau");
        this.spielerGruen = new Spieler("grün");

        do {
            System.out.println("Blauer Spieler, wo setzt du dein Zeichen (x,y)?");
            this.spielerBlau.zug(this.feld);
            this.zeigeFeld();
            if (this.feld.checkGewinn() == 'b') {
                System.out.println("Blauer Spieler hat gewonnen!");
                break;
            }
            System.out.println("Grüner Spieler, wo setzt du dein Zeichen (x,y)?");
            this.spielerGruen.zug(this.feld);
            this.zeigeFeld();
        }
        while (this.feld.checkGewinn() == '-');

        if (this.feld.checkGewinn() == 'g') {
            System.out.println("Grüner Spieler hat gewonnen!");
        }
    }

    public void zeigeFeld() {
        System.out.println("Feld des TicTacToe-Spiels:");
        for (int i = 0; i < 3; i++) {
            System.out.println(this.feld.getFeld()[i][0].getFarbChar() + " " + this.feld.getFeld()[i][1].getFarbChar() + " " + this.feld.getFeld()[i][2].getFarbChar());
        }
    }
}
